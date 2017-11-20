/**
 *
 */
package jp.co.witc_advan.javatraining.vtbank_accountOpening;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 * [処理概要] 口座開設に伴う基幹処理を行う
 * ①必須入力確認処理
 * ②正規表現確認処理(「店番」「口座番号」「CMF」)
 * ③店番の存在確認処理
 *
 * @author ㈱アドバン アドバンスクール広島校
 * @since 2017/11/14
 * @version 1.0
 *
 */
public class BL_VTBankAvailableAccountEstablish implements I_VTBankAvailableAccountEstablish {

	// Loggerクラスインスタンス生成
	final Logger logger = Logger.getLogger("VTSystem - SampleLogging");

	/**
	 * default constructor
	 */
	public BL_VTBankAvailableAccountEstablish() {
	}

	/**
	 *
	 * @param _paramDto
	 */
	public void doFacade(DTOCtrl_VTBankAvailableAccountEstablish _paramDto) {
		String[] sumDataArray = { _paramDto.getText_shimei(), _paramDto.getText_seinengappi(),
				_paramDto.getText_miseban(),_paramDto.getText_kamoku(),
				_paramDto.getText_kouzabangou(), _paramDto.getText_kouzaCmf() };

		String[] numericArray = { _paramDto.getText_miseban(),
								_paramDto.getText_kouzabangou(), _paramDto.getText_kouzaCmf()};

		// ①必須入力確認処理(nullの場合true、後続処理に遷移)
		if(!isNull(sumDataArray)){
			// ②正規表現確認処理(「店番」「口座番号」「CMF」)(正規表現を満たしている場合true)
			if(!isMatchRegularPatternArray(numericArray)){
				System.out.println("[DEBUG - ERROR 処理異常]②正規表現確認処理");
				return;
			}
			// TODO:③店番の存在確認処理

		}else{
			System.out.println("[DEBUG - ERROR 処理異常]①必須入力確認処理");
			return;
		}
	}

	/**
	 * 必須入力確認を行う
	 *
	 * @param _paramArrayCheckedData
	 */
	public boolean isNull(final String[] _paramArrayCheckedData) {
		// 戻り値用
		boolean innr_checkNull = false;
		// ログレベル指定
        logger.setLevel(Level.FINER);

		for (int i = 0; i < _paramArrayCheckedData.length; i++) {
			if (_paramArrayCheckedData[i].isEmpty()) {
				JOptionPane.showMessageDialog(
											null,
											"入力内容を見直してください。",
											"情報",
											JOptionPane.INFORMATION_MESSAGE
											);
				innr_checkNull = true;
				// ログ出力
				logger.info("[DEBUG:SYSTEM-ERROR]入力内容を見直してください。見直してください。");
				break;
			}
		}
		return innr_checkNull;
	}

	/**
	 *
	 * @param _paramCheckedArrayData
	 * @return
	 */
	public boolean isMatchRegularPatternArray(final String[] _paramCheckedArrayData) {
		//戻り値用
		boolean innr_matchRegularPatternArray = true;
		// ログレベル指定
        logger.setLevel(Level.FINER);

		Pattern ptrn = null;
		Matcher mtr = null;

		for(int i= 0;i<_paramCheckedArrayData.length;i++){
			if (i == 0) {
				//書式半角数値桁数3桁
				ptrn = Pattern.compile(CONST_NUMERIC_MISEBAN);
			} else if (i >= 1 ) {
				//口座番号/CMF 書式半角数値桁数7桁
				ptrn = Pattern.compile(CONST_NUMERIC_KOUZA_CMF);
			}
			mtr = ptrn.matcher(_paramCheckedArrayData[i]);

			if (!mtr.find()) {
				JOptionPane.showMessageDialog(
							null,
							"入力データ書式に誤りがあります。見直してください。",
							"情報",
							JOptionPane.INFORMATION_MESSAGE
							);
				innr_matchRegularPatternArray =false;
				// ログ出力
				logger.info("[DEBUG:SYSTEM-ERROR]入力データ書式に誤りがあります。見直してください。");
				break;
			}
		}
		return innr_matchRegularPatternArray;
	}

	/**
	 *
	 * @param daihyouKouzaFlg
	 *            1:店番(半角数字3桁) / 2:口座番号、CMF(半角数字7桁)
	 * @param _paramCheckedData
	 *            確認したいデータ
	 */
	public void matchRegularPattern(final int daihyouKouzaFlg, final String _paramCheckedData) {
		Pattern ptrn = null;
		Matcher mtr = null;

		if (daihyouKouzaFlg == 1) {
			ptrn = Pattern.compile(CONST_NUMERIC_MISEBAN);
		} else {
			ptrn = Pattern.compile(CONST_NUMERIC_KOUZA_CMF);
		}
		mtr = ptrn.matcher(_paramCheckedData);

		if (!mtr.find()) {
			try {
				throw new Exception("入力データ書式に誤りがあります。見直してください。");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * TODO:消去予定
	 * TEST DRIVER
	 * @param args
	 */
	public static void main(String[] args) {
		//テストデータ作成① START--------------------------------------------------------------------
		//下記データでBL＞doFacadeに移行し、成功
		DTOCtrl_VTBankAvailableAccountEstablish vrb_dto_testPtn1 =
				new DTOCtrl_VTBankAvailableAccountEstablish(
										"1", // 氏名
										"1", // 生年月日
										"1", // 科目
										"123", // 店番
										"1234567", // 口座番号
										"1234567"// 口座CMF番号
															);

		BL_VTBankAvailableAccountEstablish vrb_bl_testPtn1 = new BL_VTBankAvailableAccountEstablish();
		vrb_bl_testPtn1.doFacade(vrb_dto_testPtn1);
		//テストデータ作成① E N D--------------------------------------------------------------------

		//テストデータ作成② START--------------------------------------------------------------------
		//下記データでBL＞doFacadeに移行すると、口座番号で正規桁数に反する為エラー
		DTOCtrl_VTBankAvailableAccountEstablish vrb_dto_testPtn2 =
				new DTOCtrl_VTBankAvailableAccountEstablish(
										"1", // 氏名
										"1", // 生年月日
										"1", // 科目
										"123", // 店番
										"12345678", // 口座番号
										"12345678"// 口座CMF番号
															);

		BL_VTBankAvailableAccountEstablish vrb_bl_testPtn2 = new BL_VTBankAvailableAccountEstablish();
		vrb_bl_testPtn2.doFacade(vrb_dto_testPtn2);
		//テストデータ作成② E N D--------------------------------------------------------------------
	}

}
