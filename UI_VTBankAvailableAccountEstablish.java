package jp.co.witc_advan.javatraining.vtbank_accountOpening;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * [処理概要] 口座開設処理ユーザーインターフェース
 *
 * @author ㈱アドバン アドバンスクール広島校
 * @since 2017/11/14
 * @version 1.0
 *
 */
public class UI_VTBankAvailableAccountEstablish {

	private JFrame frame;
	private JTextField text_sei;
	private JTextField text_mei;
	private JTextField text_seinengappi_year;
	private JTextField text_miseban;
	private JTextField text_kouzabangou;
	private JTextField text_kouzaCmf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_VTBankAvailableAccountEstablish window = new UI_VTBankAvailableAccountEstablish();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI_VTBankAvailableAccountEstablish() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 651, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("ご利用開始登録");
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.BOLD, 26));
		lblNewLabel.setBounds(208, 33, 224, 37);
		frame.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("カナ氏名");
		label.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
		label.setBounds(32, 109, 174, 37);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("生年月日");
		label_1.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
		label_1.setBounds(32, 184, 174, 37);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("店番");
		label_2.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
		label_2.setBounds(32, 265, 174, 37);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("科目");
		label_3.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
		label_3.setBounds(32, 346, 174, 37);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("口座番号");
		label_4.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
		label_4.setBounds(32, 422, 174, 37);
		frame.getContentPane().add(label_4);

		JLabel lblcmf = new JLabel("代表口座CMF番号");
		lblcmf.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
		lblcmf.setBounds(32, 510, 174, 37);
		frame.getContentPane().add(lblcmf);

		text_sei = new JTextField();
		text_sei.setBounds(218, 115, 128, 31);
		frame.getContentPane().add(text_sei);
		text_sei.setColumns(10);

		text_mei = new JTextField();
		text_mei.setColumns(10);
		text_mei.setBounds(437, 115, 128, 31);
		frame.getContentPane().add(text_mei);

		text_seinengappi_year = new JTextField();
		text_seinengappi_year.setColumns(10);
		text_seinengappi_year.setBounds(218, 190, 128, 31);
		frame.getContentPane().add(text_seinengappi_year);

		text_miseban = new JTextField();
		text_miseban.setColumns(10);
		text_miseban.setBounds(218, 271, 128, 31);
		frame.getContentPane().add(text_miseban);

		text_kouzabangou = new JTextField();
		text_kouzabangou.setColumns(10);
		text_kouzabangou.setBounds(218, 428, 128, 31);
		frame.getContentPane().add(text_kouzabangou);

		text_kouzaCmf = new JTextField();
		text_kouzaCmf.setColumns(10);
		text_kouzaCmf.setBounds(218, 516, 128, 31);
		frame.getContentPane().add(text_kouzaCmf);

		final JComboBox cbo_seinengappi_month = new JComboBox();
		cbo_seinengappi_month.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cbo_seinengappi_month.setBounds(412, 190, 49, 30);
		frame.getContentPane().add(cbo_seinengappi_month);

		final JComboBox cbo_seinengappi_date = new JComboBox();
		cbo_seinengappi_date.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		cbo_seinengappi_date.setBounds(516, 190, 49, 30);
		frame.getContentPane().add(cbo_seinengappi_date);

		final JLabel lbl_kamoku = new JLabel("普通");
		lbl_kamoku.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
		lbl_kamoku.setBounds(217, 346, 174, 37);
		frame.getContentPane().add(lbl_kamoku);

		JButton btnNewButton = new JButton("次へ");
		btnNewButton.addActionListener(new ActionListener() {
			/**
			 * 「次へ」ボタン押下時処理
			 */
			public void actionPerformed(ActionEvent e) {
				//氏名・姓
				String innr_sei = null;
				//氏名・名
				String innr_mei = null;
				//氏名
				String innr_shimei = null;
				//生年月日・年
				String innr_seinengappi_year = null;
				//生年月日・月
				String innr_seinengappi_month = null;
				//生年月日・日
				String innr_seinengappi_date = null;
				//店番
				String innr_miseban = null;
				//科目
				String innr_kamoku = null;
				//口座番号
				String innr_kouzabangou = null;
				//CMF口座番号
				String innr_kouzacmfbangou = null;

				//文字列データの連結を行う
				StringBuilder sbdr = new StringBuilder();
				StringBuilder sbdr_seinengappi = new StringBuilder();

				innr_sei = text_sei.getText();
				innr_mei = text_mei.getText();
				innr_seinengappi_year = text_seinengappi_year.getText();

				if(cbo_seinengappi_month.getSelectedIndex()==-1){
					System.out.println("月が選択されていません。");
				}else{
					innr_seinengappi_month = (String) cbo_seinengappi_month.getSelectedItem();
				}

				if(cbo_seinengappi_date.getSelectedIndex()==-1){
					System.out.println("日が選択されていません。");
				}else{
					innr_seinengappi_date = (String) cbo_seinengappi_date.getSelectedItem();
				}

				sbdr_seinengappi.append(innr_seinengappi_year).append(innr_seinengappi_month).append(innr_seinengappi_month);

				innr_kamoku = lbl_kamoku.getText();
				innr_miseban = text_miseban.getText();
				innr_kouzabangou = text_kouzabangou.getText();
				innr_kouzacmfbangou = text_kouzaCmf.getText();

				//cf.文字列連結実装方法一覧 ----------------------- START
				//①+ 連結子
//				innr_shimei = innr_sei + innr_mei;
				//②String.concat();  Excel:concatenate()
//				innr_shimei = innr_sei.concat(innr_mei);
				//③StringBuffer.append()
//				StringBuffer sbuf = new StringBuffer();
//				sbuf.append(innr_sei).append(innr_mei).toString();
				//cf.文字列連結実装方法一覧 ----------------------- E N D
				//必須入力確認を行う
//				checkNull(innr_sei);
				//TODO オーバーロードしたcheckNullを呼び出すために、
				//画面項目の取得後、String[]におさめてわたす事
				//checkNull();

				//文字列データの連結をappendにより行う
				sbdr.append(innr_sei);
				sbdr.append(innr_mei);
				//メソッドチェーン
				//sbdr.append(innr_sei).append(innr_mei);
//				System.out.println(sbdr.toString());
				//店番号・口座番号・CMF番号における正規表現確認(所定の入力書式+桁数)

				//DTO(Data Transfer Object)クラスに対して、画面項目データを渡す
				DTOCtrl_VTBankAvailableAccountEstablish vrb_dto =
							new DTOCtrl_VTBankAvailableAccountEstablish(
													sbdr.toString(),//氏名
													sbdr_seinengappi.toString(),//生年月日
													innr_kamoku,//科目
													innr_miseban,//店番
													innr_kouzabangou,//口座番号
													innr_kouzacmfbangou//口座CMF番号
																		);
				//BL(Business Logic)クラスの生成(呼び出し)
				BL_VTBankAvailableAccountEstablish vrb_bl =
						new BL_VTBankAvailableAccountEstablish();
				//BLクラス処理委譲
				vrb_bl.doFacade(vrb_dto);


			}
		});
		btnNewButton.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
		btnNewButton.setBounds(133, 605, 139, 46);
		frame.getContentPane().add(btnNewButton);

		JButton button = new JButton("入力初期化");
		button.setFont(new Font("MS UI Gothic", Font.BOLD, 20));
		button.setBounds(350, 605, 139, 46);
		frame.getContentPane().add(button);
	}


}
