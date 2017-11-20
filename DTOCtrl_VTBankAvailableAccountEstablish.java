/**
 *
 */
package jp.co.witc_advan.javatraining.vtbank_accountOpening;

/**
 * [処理概要]画面データ保管
 *
 * @author ㈱アドバン アドバンスクール広島校
 * @since 2017/11/14
 * @version 1.0
 *
 */
public class DTOCtrl_VTBankAvailableAccountEstablish {
	//氏名
	private String text_shimei;
	//生年月日
	private String text_seinengappi;
	//科目
	private String text_kamoku;
	//店番
	private String text_miseban;
	//口座番号
	private String text_kouzabangou;
	//CMF番号
	private String text_kouzaCmf;

	/**
	 *
	 */
	public DTOCtrl_VTBankAvailableAccountEstablish() {}

	/**
	 *
	 * @param text_shimei
	 * @param text_seinengappi
	 * @param text_kamoku
	 * @param text_miseban
	 * @param text_kouzabangou
	 * @param text_kouzaCmf
	 */
	public DTOCtrl_VTBankAvailableAccountEstablish(String text_shimei,String text_seinengappi,
													String text_kamoku,String text_miseban,
													String text_kouzabangou,String text_kouzaCmf) {
		//このクラス内メソッドsetText_shimeiにおいて、引数:氏名を設定する
		this.setText_shimei(text_shimei);
		//このクラス内メソッドsetText_seinengappiにおいて、引数:氏名を設定する
		this.setText_seinengappi(text_seinengappi);
		//このクラス内メソッドsetText_misebanにおいて、引数:氏名を設定する
		this.setText_miseban(text_miseban);
		//このクラス内メソッドsetText_kamokuにおいて、引数:氏名を設定する
		this.setText_kamoku(text_kamoku);
		//このクラス内メソッドsetText_kouzabangouにおいて、引数:氏名を設定する
		this.setText_kouzabangou(text_kouzabangou);
		//このクラス内メソッドsetText_kouzaCmfにおいて、引数:氏名を設定する
		this.setText_kouzaCmf(text_kouzaCmf);
	}

	/**
	 * @return text_shimei
	 */
	public String getText_shimei() {
		return text_shimei;
	}

	/**
	 * @param text_shimei セットする text_shimei
	 */
	public void setText_shimei(String text_shimei) {
		this.text_shimei = text_shimei;
	}

	/**
	 * @return text_seinengappi
	 */
	public String getText_seinengappi() {
		return text_seinengappi;
	}

	/**
	 * @param text_seinengappi セットする text_seinengappi
	 */
	public void setText_seinengappi(String text_seinengappi) {
		this.text_seinengappi = text_seinengappi;
	}

	/**
	 * @return text_kamoku
	 */
	public String getText_kamoku() {
		return text_kamoku;
	}

	/**
	 * @param text_kamoku セットする text_kamoku
	 */
	public void setText_kamoku(String text_kamoku) {
		this.text_kamoku = text_kamoku;
	}

	/**
	 * @return text_miseban
	 */
	public String getText_miseban() {
		return text_miseban;
	}

	/**
	 * @param text_miseban セットする text_miseban
	 */
	public void setText_miseban(String text_miseban) {
		this.text_miseban = text_miseban;
	}

	/**
	 * @return text_kouzabangou
	 */
	public String getText_kouzabangou() {
		return text_kouzabangou;
	}

	/**
	 * @param text_kouzabangou セットする text_kouzabangou
	 */
	public void setText_kouzabangou(String text_kouzabangou) {
		this.text_kouzabangou = text_kouzabangou;
	}

	/**
	 * @return text_kouzaCmf
	 */
	public String getText_kouzaCmf() {
		return text_kouzaCmf;
	}

	/**
	 * @param text_kouzaCmf セットする text_kouzaCmf
	 */
	public void setText_kouzaCmf(String text_kouzaCmf) {
		this.text_kouzaCmf = text_kouzaCmf;
	}



}
