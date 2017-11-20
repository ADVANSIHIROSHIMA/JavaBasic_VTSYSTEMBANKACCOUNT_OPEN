/**
 *
 */
package jp.co.witc_advan.javatraining.vtbank_accountOpening;

/**
 * [処理概要] 口座開設処理インターフェース
 *
 * @author ㈱アドバン アドバンスクール広島校
 * @since 2017/11/14
 * @version 1.0
 *
 */
public interface I_VTBankAvailableAccountEstablish {

	/*** 店番用の正規表現 ***/
	public String CONST_NUMERIC_MISEBAN = "^[0-9]{1,3}+$";

	/*** 口座番号及び代表口座CMF用の正規表現 ***/
	public String CONST_NUMERIC_KOUZA_CMF = "^[0-9]{1,7}+$";

}
