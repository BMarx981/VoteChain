package application;

public class VoteBlock {
	
	private String hash;
	private String previousHash;
	private String data;
	private long timeStamp;
	private int nonce;
	
	public VoteBlock() {}
	
	public VoteBlock(String data, String previousHash) {
		this.previousHash = previousHash;
		this.data = data;
	}
	
	public String calculateHash() {
		return VoterUtils.applySHA256(previousHash + Long.toString(timeStamp) + data);
	}
	
	

}
