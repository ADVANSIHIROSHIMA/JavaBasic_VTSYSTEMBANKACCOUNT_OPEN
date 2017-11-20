/**
 *
 */
package jp.co.witc_advan.javatraining.vtbank_accountOpening;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * [処理概要]CSVファイル読み取り
 *
 * @author ㈱アドバン アドバンスクール広島校
 * @since 2017/11/14
 * @version 1.0
 *
 */
public class FileUtil {

	/**
	 *
	 */
	public FileUtil() {}

	/**
	 *
	 */
	public void readCSV(){
		//ファイル内容読み込み定義用変数定義
		String str_fileLineData = null;
		//ファイルパスの定義用変数定義
		String str_filepath = null;
		//ファイル区切り文字
		String[] str_csvData = null;
		//ファイル読み込み用変数定義
		BufferedReader bufRdr = null;

		//物理ファイルパスの設定
		str_filepath =
			"C:/workspace45_witcsi(javatraining)/WITC_SI_KENSHU_9THPeriod/src/jp/co/witc_advan/javatraining/vtbank_accountOpening/m_vtbank_mise.csv";

		try {
System.out.println("START [readCSVFile処理確認]CSVファイルデータ出力");
			//ファイル読み込み
			bufRdr = new BufferedReader(new FileReader(str_filepath));
			//BufferedReader:JVMの中のデータの棚イメージ
			//棚の一番上の段から1行ずつ読み込みを行う
			while((str_fileLineData=bufRdr.readLine())!=null){
				//(str_fileLineData=bufRdr.readLine())
				//↓↓↓
				//001,本店営業部

				//str_csvData[0]:A001 / str_csvData[1]:テスト商品A
				str_csvData = str_fileLineData.split(",");

				for(String csvInnerOutData:str_csvData){
System.out.print(csvInnerOutData+"\t");
				}
System.out.println();
			}//end while
System.out.println("END [readCSVFile処理確認]CSVファイルデータ出力");
		} catch (FileNotFoundException e) {
			//該当ファイルが存在しない場合の例外
			e.printStackTrace();
		} catch (IOException e) {
			//ファイル入出力時の例外
			e.printStackTrace();
		} finally{
			//最終的に行うべき処理
			try {
				//BufferedReader終了(BufferedReaderリソース解放)
				bufRdr.close();
				str_fileLineData = null;
				str_filepath = null;
				str_csvData = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//end finally
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileUtil vrb = new FileUtil();
		vrb.readCSV();

	}

}
