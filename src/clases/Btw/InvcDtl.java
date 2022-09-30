package clases.Btw;

import java.io.Serializable;

import lombok.Data;

@Data
public  class InvcDtl  implements Serializable{
    private static final long serialVersionUID = 1L;
    private String company;
    private String invoiceNum;
    private double invoiceLine;
    private String partNum;
    private String lineDesc;
    private String lineDesc2;
    private String lineDesc3;
    private String partNumPartDescription;
    private double sellingShipQty;
    private String salesUM;
    private double unitPrice;
    private double docUnitPrice;
    private double docExtPrice;
    private double dspDocExtPrice;
    private double discountPercent;
    private double discount;
    private double docDiscount;
    private double dspDocLessDiscount;
    private double dspDocTotalMiscChrg;
    private String currencyCode;
    private String netWeight;
    private double grossWeight;
    private double numberBoxes;
    private String idSupplier;
    private String idTypeSupplier;
    private String idContractSupplier;
    private String shipViaCodeDescription;
    private String amountRequest;
    private String amountSent;
    private String codInvima;
    private double stemsAmount;
    private double bouquetsAmount;
    private double stemPrice;
    private double pieceAmount;
    private String poLine;
    private String invoiceLinePrepayment;
    private String invoiceLineValuePaid;
    private double valueInvoiceLine;
    private double taxAmtLineIVA;
    private double taxAmtLineReteiva;
    private double taxAmtLineReteica;
    private double taxAmtLineRetefuente;
    private double taxAmtLineIpoConsumo;
    private String documentTypeCodeLine;
    private String standardItemIdentificationIDLine;
    private String deliveryLocationIDLine;
    private String taxSubtotalPercentLine;
    private String taxSubtotalTaxAmountLine;
    private String qualityCertificate;
    private double payment;
    private String standardItemID;
    private String schemeAgencyID;
    private String brandName;
    private String modelName;
    private String userID;
}
