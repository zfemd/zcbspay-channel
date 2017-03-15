package com.zcbspay.platform.channel.simulation.insteadpay.pojo;
// default package
// Generated 2017-3-13 14:30:06 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * TOrderPaymentSingle generated by hbm2java
 */
@Entity
@Table(name = "T_ORDER_PAYMENT_SINGLE")
public class OrderPaymentSingleDO implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6444094189419139974L;
	private long tid;
	private String version;
	private String accesstype;
	private String coopinstiid;
	private String merid;
	private String mername;
	private String merabbr;
	private String encoding;
	private String txntype;
	private String txnsubtype;
	private String biztype;
	private String backurl;
	private String txntime;
	private String paytimeout;
	private String orderid;
	private String currencycode;
	private Long txnamt;
	private String debtorbank;
	private String debtoraccount;
	private String debtorname;
	private String debtorconsign;
	private String creditorbank;
	private String creditoraccount;
	private String creditorname;
	private String proprietary;
	private String summary;
	private String reserved;
	private String respcode;
	private String respmsg;
	private String tn;
	private String relatetradetxn;
	private String status;
	private String ordercommitime;
	private String syncnotify;
	private String notes;
	private String remarks;
	private String orderdesc;
	
	public OrderPaymentSingleDO() {
	}

	public OrderPaymentSingleDO(long tid) {
		this.tid = tid;
	}

	public OrderPaymentSingleDO(long tid, String accesstype, String coopinstiid,
			String merid, String encoding, String txntype, String txnsubtype,
			String biztype, String backurl, String txntime, String orderid,
			String currencycode, Long txnamt, String debtorbank,
			String debtoraccount, String debtorname, String debtorconsign,
			String creditorbank, String creditoraccount, String creditorname,
			String proprietary, String summary, String reserved,
			String respcode, String respmsg, String tn, String relatetradetxn,
			String status, String ordercommitime, String syncnotify,
			String notes, String remarks) {
		this.tid = tid;
		this.accesstype = accesstype;
		this.coopinstiid = coopinstiid;
		this.merid = merid;
		this.encoding = encoding;
		this.txntype = txntype;
		this.txnsubtype = txnsubtype;
		this.biztype = biztype;
		this.backurl = backurl;
		this.txntime = txntime;
		this.orderid = orderid;
		this.currencycode = currencycode;
		this.txnamt = txnamt;
		this.debtorbank = debtorbank;
		this.debtoraccount = debtoraccount;
		this.debtorname = debtorname;
		this.debtorconsign = debtorconsign;
		this.creditorbank = creditorbank;
		this.creditoraccount = creditoraccount;
		this.creditorname = creditorname;
		this.proprietary = proprietary;
		this.summary = summary;
		this.reserved = reserved;
		this.respcode = respcode;
		this.respmsg = respmsg;
		this.tn = tn;
		this.relatetradetxn = relatetradetxn;
		this.status = status;
		this.ordercommitime = ordercommitime;
		this.syncnotify = syncnotify;
		this.notes = notes;
		this.remarks = remarks;
	}

	@Id
	@Column(name = "TID", unique = true, nullable = false, precision = 12, scale = 0)
	public long getTid() {
		return this.tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	
	@Column(name = "VERSION", length = 6)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "ACCESSTYPE", length = 1)
	public String getAccesstype() {
		return this.accesstype;
	}

	public void setAccesstype(String accesstype) {
		this.accesstype = accesstype;
	}

	@Column(name = "COOPINSTIID", length = 15)
	public String getCoopinstiid() {
		return this.coopinstiid;
	}

	public void setCoopinstiid(String coopinstiid) {
		this.coopinstiid = coopinstiid;
	}

	@Column(name = "MERID", length = 15)
	public String getMerid() {
		return this.merid;
	}

	public void setMerid(String merid) {
		this.merid = merid;
	}

	@Column(name = "ENCODING", length = 2)
	public String getEncoding() {
		return this.encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	@Column(name = "TXNTYPE", length = 2)
	public String getTxntype() {
		return this.txntype;
	}

	public void setTxntype(String txntype) {
		this.txntype = txntype;
	}

	@Column(name = "TXNSUBTYPE", length = 2)
	public String getTxnsubtype() {
		return this.txnsubtype;
	}

	public void setTxnsubtype(String txnsubtype) {
		this.txnsubtype = txnsubtype;
	}

	@Column(name = "BIZTYPE", length = 6)
	public String getBiztype() {
		return this.biztype;
	}

	public void setBiztype(String biztype) {
		this.biztype = biztype;
	}

	@Column(name = "BACKURL", length = 128)
	public String getBackurl() {
		return this.backurl;
	}

	public void setBackurl(String backurl) {
		this.backurl = backurl;
	}

	@Column(name = "TXNTIME", length = 14)
	public String getTxntime() {
		return this.txntime;
	}

	public void setTxntime(String txntime) {
		this.txntime = txntime;
	}

	@Column(name = "ORDERID", length = 32)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "CURRENCYCODE", length = 3)
	public String getCurrencycode() {
		return this.currencycode;
	}

	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}

	@Column(name = "TXNAMT", precision = 12, scale = 0)
	public Long getTxnamt() {
		return this.txnamt;
	}

	public void setTxnamt(Long txnamt) {
		this.txnamt = txnamt;
	}

	@Column(name = "DEBTORBANK", length = 14)
	public String getDebtorbank() {
		return this.debtorbank;
	}

	public void setDebtorbank(String debtorbank) {
		this.debtorbank = debtorbank;
	}

	@Column(name = "DEBTORACCOUNT", length = 32)
	public String getDebtoraccount() {
		return this.debtoraccount;
	}

	public void setDebtoraccount(String debtoraccount) {
		this.debtoraccount = debtoraccount;
	}

	@Column(name = "DEBTORNAME", length = 64)
	public String getDebtorname() {
		return this.debtorname;
	}

	public void setDebtorname(String debtorname) {
		this.debtorname = debtorname;
	}

	@Column(name = "DEBTORCONSIGN", length = 60)
	public String getDebtorconsign() {
		return this.debtorconsign;
	}

	public void setDebtorconsign(String debtorconsign) {
		this.debtorconsign = debtorconsign;
	}

	@Column(name = "CREDITORBANK", length = 14)
	public String getCreditorbank() {
		return this.creditorbank;
	}

	public void setCreditorbank(String creditorbank) {
		this.creditorbank = creditorbank;
	}

	@Column(name = "CREDITORACCOUNT", length = 32)
	public String getCreditoraccount() {
		return this.creditoraccount;
	}

	public void setCreditoraccount(String creditoraccount) {
		this.creditoraccount = creditoraccount;
	}

	@Column(name = "CREDITORNAME", length = 64)
	public String getCreditorname() {
		return this.creditorname;
	}

	public void setCreditorname(String creditorname) {
		this.creditorname = creditorname;
	}

	@Column(name = "PROPRIETARY", length = 5)
	public String getProprietary() {
		return this.proprietary;
	}

	public void setProprietary(String proprietary) {
		this.proprietary = proprietary;
	}

	@Column(name = "SUMMARY", length = 64)
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name = "RESERVED", length = 1024)
	public String getReserved() {
		return this.reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	@Column(name = "RESPCODE", length = 20)
	public String getRespcode() {
		return this.respcode;
	}

	public void setRespcode(String respcode) {
		this.respcode = respcode;
	}

	@Column(name = "RESPMSG", length = 256)
	public String getRespmsg() {
		return this.respmsg;
	}

	public void setRespmsg(String respmsg) {
		this.respmsg = respmsg;
	}

	@Column(name = "TN", length = 32)
	public String getTn() {
		return this.tn;
	}

	public void setTn(String tn) {
		this.tn = tn;
	}

	@Column(name = "RELATETRADETXN", length = 16)
	public String getRelatetradetxn() {
		return this.relatetradetxn;
	}

	public void setRelatetradetxn(String relatetradetxn) {
		this.relatetradetxn = relatetradetxn;
	}

	@Column(name = "STATUS", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "ORDERCOMMITIME", length = 14)
	public String getOrdercommitime() {
		return this.ordercommitime;
	}

	public void setOrdercommitime(String ordercommitime) {
		this.ordercommitime = ordercommitime;
	}

	@Column(name = "SYNCNOTIFY", length = 2)
	public String getSyncnotify() {
		return this.syncnotify;
	}

	public void setSyncnotify(String syncnotify) {
		this.syncnotify = syncnotify;
	}

	@Column(name = "NOTES", length = 256)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "REMARKS", length = 256)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "MERNAME", length = 40)
	public String getMername() {
		return mername;
	}

	public void setMername(String mername) {
		this.mername = mername;
	}
	@Column(name = "MERABBR", length = 40)
	public String getMerabbr() {
		return merabbr;
	}

	public void setMerabbr(String merabbr) {
		this.merabbr = merabbr;
	}
	@Column(name = "PAYTIMEOUT", length = 14)
	public String getPaytimeout() {
		return paytimeout;
	}

	public void setPaytimeout(String paytimeout) {
		this.paytimeout = paytimeout;
	}
	@Column(name = "ORDERDESC", length = 256)
	public String getOrderdesc() {
		return orderdesc;
	}

	public void setOrderdesc(String orderdesc) {
		this.orderdesc = orderdesc;
	}
	
}
