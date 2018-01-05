/**
 * WebServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package debisys_soap_services;

public interface WebServices extends java.rmi.Remote {
    public java.lang.String getTransactions(java.lang.String version, java.lang.String terminalId, java.lang.String numberOfTransactions) throws java.rmi.RemoteException;
    public java.lang.String checkTerminal(java.lang.String version, java.lang.String terminalId) throws java.rmi.RemoteException;
    public java.lang.String pinDistSale_XBorder(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String originCountry, java.lang.String destinationCountry, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String pinDistSale_XBorder_01(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String originCountry, java.lang.String destinationCountry, java.lang.String invoiceNo, java.lang.String languageOption, int transType, java.lang.String ipAddress) throws java.rmi.RemoteException;
    public java.lang.String pinDistSaleTicket(java.lang.String version, java.lang.String transactionId, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String pinDistSaleUSSD(java.lang.String version, java.lang.String phoneNumber, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String pinDistRefund(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String getProductsProvidersLimits(java.lang.String version, java.lang.String terminalId, java.lang.String transTypeId, java.lang.String carrierId, java.lang.String categoryId, java.lang.String productId) throws java.rmi.RemoteException;
    public java.lang.String getProductListExt(java.lang.String version, java.lang.String terminalId, java.lang.String transTypeId, java.lang.String carrierId, java.lang.String categoryId, java.lang.String productId) throws java.rmi.RemoteException;
    public java.lang.String getProductList(java.lang.String version, java.lang.String terminalId, java.lang.String transTypeId, java.lang.String carrierId, java.lang.String categoryId, java.lang.String productId) throws java.rmi.RemoteException;
    public java.lang.String getCarrierList(java.lang.String version, java.lang.String terminalId, java.lang.String transTypeId, java.lang.String carrierId, java.lang.String categoryId, java.lang.String productId) throws java.rmi.RemoteException;
    public java.lang.String getCategoryList(java.lang.String version, java.lang.String terminalId, java.lang.String transTypeId, java.lang.String carrierId, java.lang.String categoryId, java.lang.String productId) throws java.rmi.RemoteException;
    public java.lang.String getTransTypeList(java.lang.String version, java.lang.String terminalId, java.lang.String transTypeId, java.lang.String carrierId, java.lang.String categoryId, java.lang.String productId) throws java.rmi.RemoteException;
    public java.lang.String transactionConfirm(java.lang.String version, java.lang.String terminalId, java.lang.String transactionId) throws java.rmi.RemoteException;
    public java.lang.String transactionsDetailsForDay(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String dayDate, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String PINReturnRequestStatus(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String caseId, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String PINReturnRequest(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String getAccountBalance(java.lang.String version, java.lang.String terminalId, java.lang.String merchantId) throws java.rmi.RemoteException;
    public java.lang.String submitPaymentNotification(java.lang.String version, java.lang.String terminalId, java.lang.String amount, java.lang.String clerkPassword, java.lang.String documentNumber, java.lang.String documentDate, java.lang.String bankCode) throws java.rmi.RemoteException;
    public java.lang.String getBillPaymentBalance(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String giftCardActivate(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String serialNumber, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String giftCardDeactivate(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String transactionId, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String giftCardBalance(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String cardNumber, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String giftCardQueryFee(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String storedValueLoad(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String cardNumber, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String storedValueRefund(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String transactionId, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String storedValueBalance(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String cardNumber, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String storedValueActivate(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String serialNumber, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String storedValueDeactivate(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String transactionId, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String storedValueQueryFee(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String operation, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String checkTransactionByInvoiceNo(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String invoiceNo) throws java.rmi.RemoteException;
    public java.lang.String checkMerchantPayment(java.lang.String version, java.lang.String merchantID, java.lang.String amount, java.lang.String refNumber, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String lookUpTransactionByInvocieNo(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String invoiceNo) throws java.rmi.RemoteException;
    public java.lang.String getBProductList(java.lang.String version, java.lang.String terminalId) throws java.rmi.RemoteException;
    public java.lang.String checkProviderStatus(java.lang.String version, java.lang.String terminalId, java.lang.String productId) throws java.rmi.RemoteException;
    public java.lang.String sendNotification(java.lang.String version, java.lang.String emails, java.lang.String messages, java.lang.String subject) throws java.rmi.RemoteException;
    public java.lang.String getTicketForTransaction(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String amount, java.lang.String language) throws java.rmi.RemoteException;
    public java.lang.String getProductFee(java.lang.String version, java.lang.String productId, java.lang.String amount) throws java.rmi.RemoteException;
    public java.lang.String getProductUFee(java.lang.String version, java.lang.String productId) throws java.rmi.RemoteException;
    public java.lang.String getMerchantBalance(java.lang.String version, java.lang.String merchantID, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String getTerminalBalance(java.lang.String version, java.lang.String terminalId, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String billPaymentInfoMx(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String billPaymentSaleMx(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String invoiceNo, java.lang.String languageOption, java.lang.String fields) throws java.rmi.RemoteException;
    public java.lang.String doSimActivationGSM1(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String producIdSim, java.lang.String amountSim, java.lang.String productIdPin, java.lang.String amountPin, java.lang.String esn, java.lang.String sim, java.lang.String zipCode, java.lang.String netWorkType, java.lang.String invoiceNo, java.lang.String language) throws java.rmi.RemoteException;
    public java.lang.String doSimActivationCDMA1(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String producIdSim, java.lang.String amountSim, java.lang.String productIdPin, java.lang.String amountPin, java.lang.String esn, java.lang.String zipCode, java.lang.String netWorkType, java.lang.String invoiceNo, java.lang.String language) throws java.rmi.RemoteException;
    public java.lang.String applyPaymentISOLevel(java.lang.String version, java.lang.String merchantID, java.lang.String amount, java.lang.String description, java.lang.String refNumber, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String DMCActivation(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String producIdSim, java.lang.String productIdPin, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String zipCode, java.lang.String contactNumber, java.lang.String corpId, java.lang.String dateOfBirth, java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String password, java.lang.String securityQuestionId, java.lang.String securityQuestionAnswer, java.lang.String serviceZipCode, java.lang.String passcode, java.lang.String sn, java.lang.String iccid, java.lang.String invoiceNo, java.lang.String languageOption, java.lang.String carrierId) throws java.rmi.RemoteException;
    public java.lang.String DMCDeviceCheck(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String esn, java.lang.String carrierId, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String DMCPortInActivation(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String producIdSim, java.lang.String productIdPin, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String zipCode, java.lang.String contactNumber, java.lang.String corpId, java.lang.String dateOfBirth, java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String password, java.lang.String securityQuestionId, java.lang.String securityQuestionAnswer, java.lang.String serviceZipCode, java.lang.String esn, java.lang.String mdn, java.lang.String passCode, java.lang.String sn, java.lang.String iccid, java.lang.String portAccountNo, java.lang.String portBusinessName, java.lang.String portCity, java.lang.String portFirstName, java.lang.String portLastName, java.lang.String portMdn, java.lang.String portPasswordPin, java.lang.String portState, java.lang.String portStreetName, java.lang.String portStreetNo, java.lang.String portZip, java.lang.String invoiceNo, java.lang.String languageOption, java.lang.String carrierId) throws java.rmi.RemoteException;
    public java.lang.String getPinProductsForActivation(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String activationProductId, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String applyPaymentAgentLevel(java.lang.String version, java.lang.String merchantID, java.lang.String amount, java.lang.String description, java.lang.String refNumber, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String getQuippiFxRate(java.lang.String version, java.lang.String siteID, java.lang.String clerkID, java.lang.String productID, java.lang.String amount, java.lang.String invoiceNo) throws java.rmi.RemoteException;
    public java.lang.String quippiCreatePIN(java.lang.String version, java.lang.String siteID, java.lang.String clerkID, java.lang.String productID, java.lang.String amount, java.lang.String senderMobile, java.lang.String sendeFirstName, java.lang.String senderLastName, java.lang.String recipientFirstName, java.lang.String recipientLastName, java.lang.String externalFx, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String quippiCancelPIN(java.lang.String version, java.lang.String siteID, java.lang.String clerkID, java.lang.String productID, java.lang.String amount, java.lang.String PIN, java.lang.String PAN, java.lang.String transactionID, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String quippiAuthorize(java.lang.String version, java.lang.String siteID, java.lang.String clerkID, java.lang.String PIN, java.lang.String invoiceNo) throws java.rmi.RemoteException;
    public java.lang.String lycaPortInDetails(java.lang.String version, java.lang.String siteId, java.lang.String clerkID, java.lang.String productId, java.lang.String languageOption, java.lang.String referenceType, java.lang.String referenceNumber) throws java.rmi.RemoteException;
    public java.lang.String lycaCheckPortInEligibility(java.lang.String version, java.lang.String siteId, java.lang.String clerkID, java.lang.String productId, java.lang.String languageOption, java.lang.String portinPhoneNumber, java.lang.String portinSIMNumber) throws java.rmi.RemoteException;
    public java.lang.String lycaCancelPortIn(java.lang.String version, java.lang.String siteId, java.lang.String clerkID, java.lang.String productId, java.lang.String amount, java.lang.String languageOption, java.lang.String referenceNumber, java.lang.String portinNumber, java.lang.String emidaTransactionId) throws java.rmi.RemoteException;
    public java.lang.String lycaModifyPortIn(java.lang.String version, java.lang.String siteId, java.lang.String clerkID, java.lang.String productId, java.lang.String languageOption, java.lang.String referenceNumber, java.lang.String portInNumber, java.lang.String portInSIMNumber, java.lang.String portInAccountNumber, java.lang.String portInPasswordPin, java.lang.String portInZipCode) throws java.rmi.RemoteException;
    public java.lang.String validateLoginSecurity(java.lang.String rootTag, java.lang.String terminalId, java.lang.String version, java.lang.String ipAddress, java.lang.String clerkID, java.lang.String strResponse) throws java.rmi.RemoteException;
    public java.lang.String locusActivateCDMAesn(java.lang.String siteId, java.lang.String pinProductId, java.lang.String clerkId, java.lang.String activationProductId, java.lang.String languageId, java.lang.String invoiceNo, java.lang.String version, java.lang.String esn, java.lang.String npa, java.lang.String city, java.lang.String zip) throws java.rmi.RemoteException;
    public java.lang.String locusActivateCDMAsim(java.lang.String siteId, java.lang.String pinProductId, java.lang.String clerkId, java.lang.String activationProductId, java.lang.String languageId, java.lang.String invoiceNo, java.lang.String version, java.lang.String esn, java.lang.String npa, java.lang.String sim, java.lang.String city, java.lang.String zip) throws java.rmi.RemoteException;
    public java.lang.String locusActivateGSMAfcode(java.lang.String siteId, java.lang.String pinProductId, java.lang.String clerkId, java.lang.String activationProductId, java.lang.String languageId, java.lang.String invoiceNo, java.lang.String version, java.lang.String afcode, java.lang.String npa, java.lang.String city, java.lang.String zip) throws java.rmi.RemoteException;
    public java.lang.String locusActivateGSMsim(java.lang.String siteId, java.lang.String pinProductId, java.lang.String clerkId, java.lang.String activationProductId, java.lang.String languageId, java.lang.String invoiceNo, java.lang.String version, java.lang.String npa, java.lang.String sim, java.lang.String city, java.lang.String zip) throws java.rmi.RemoteException;
    public java.lang.String lycaPortinPin(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String sim, java.lang.String msisdn, java.lang.String accountNumber, java.lang.String password, java.lang.String zipCode, java.lang.String languageOption, java.lang.String contactEmail, java.lang.String plan, java.lang.String amount, java.lang.String invoice, java.lang.String language) throws java.rmi.RemoteException;
    public java.lang.String lycaPortinRTR(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String sim, java.lang.String msisdn, java.lang.String accountNumber, java.lang.String password, java.lang.String zipCode, java.lang.String languageOption, java.lang.String contactEmail, java.lang.String amount, java.lang.String invoice, java.lang.String language) throws java.rmi.RemoteException;
    public java.lang.String lycaActivationPin(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String sim, java.lang.String zipCode, java.lang.String languageOption, java.lang.String contactEmail, java.lang.String plan, java.lang.String amount, java.lang.String invoice, java.lang.String language) throws java.rmi.RemoteException;
    public java.lang.String lycaActivationRTR(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String sim, java.lang.String zipCode, java.lang.String languageOption, java.lang.String contactEmail, java.lang.String amount, java.lang.String invoice, java.lang.String language) throws java.rmi.RemoteException;
    public java.lang.String billPaymentUserFee(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String amount, java.lang.String account, java.lang.String invoiceNo, java.lang.String language) throws java.rmi.RemoteException;
    public java.lang.String[] insertMerchant(java.lang.String iso, java.lang.String jsonKeyValueMap) throws java.rmi.RemoteException;
    public java.lang.String[] checkMerchantByIsoAndTaxId(java.lang.String iso, java.lang.String tax_id, java.lang.String language) throws java.rmi.RemoteException;
    public java.lang.String lookUpBillPaymentMxByInvocieNo(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String invoiceNo) throws java.rmi.RemoteException;
    public java.lang.String lookUpSimActivationByInvoiceNo1(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String invoiceNo) throws java.rmi.RemoteException;
    public java.lang.String lookupQuippiTransactionByInvoiceNo(java.lang.String version, java.lang.String siteID, java.lang.String clerkID, java.lang.String productID, java.lang.String amount, java.lang.String originalInvoiceNo) throws java.rmi.RemoteException;
    public java.lang.String checkClerk(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId) throws java.rmi.RemoteException;
    public java.lang.String commTest() throws java.rmi.RemoteException;
    public java.lang.String cardSale(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String cardBalance(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String cardRefund(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String pinDistSale(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String postRequest(java.lang.String request) throws java.rmi.RemoteException;
    public java.lang.String transRefund(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String billPayment(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String invoiceNo, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String version, java.lang.String userName, java.lang.String password, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String logout(java.lang.String version, java.lang.String userName, java.lang.String password, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String login2(java.lang.String version, java.lang.String userName, java.lang.String password, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String NOCOperation(java.lang.String version, java.lang.String addressWebService, java.lang.String queryString) throws java.rmi.RemoteException;
    public java.lang.String saleAsync(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String productId, java.lang.String accountId, java.lang.String amount, java.lang.String invoiceNo, java.lang.String language, java.lang.String regCode) throws java.rmi.RemoteException;
    public java.lang.String checkTBID(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String invoiceNo, java.lang.String language) throws java.rmi.RemoteException;
    public java.lang.String checkTrxById(java.lang.String version, java.lang.String terminalId, java.lang.String clerkId, java.lang.String trxId, java.lang.String language) throws java.rmi.RemoteException;
    public java.lang.String applyPayment(java.lang.String version, java.lang.String merchantID, java.lang.String amount, java.lang.String description, java.lang.String refNumber, java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String quippiRedeem(java.lang.String version, java.lang.String siteID, java.lang.String clerkID, java.lang.String PIN, java.lang.String locationID, java.lang.String posID, java.lang.String posOperatorID, java.lang.String recipientID, java.lang.String invoiceNo) throws java.rmi.RemoteException;
    public java.lang.String[] isoLogin(java.lang.String iso, java.lang.String user, java.lang.String password, java.lang.String languageOption) throws java.rmi.RemoteException;
    public java.lang.String[] isoLogout(java.lang.String iso, java.lang.String user, java.lang.String password, java.lang.String languageOption) throws java.rmi.RemoteException;
    public void setTagNewCreditAfterTransaction(java.lang.String tagNewCreditAfterTransaction) throws java.rmi.RemoteException;
    public java.lang.String getTagNewCreditAfterTransaction() throws java.rmi.RemoteException;
}