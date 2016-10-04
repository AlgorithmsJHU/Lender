/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompressionRatio;

/**
 *
 * @author glender
 */
public class CompressionRatio {

	private double uncompressed;
	private double compressed;

	public CompressionRatio() {
	}

	public void setCompressed(double compressedSize) {
		this.compressed = compressedSize;
	}

	public void setUncompressed(double uncompressedSize) {
		this.uncompressed = uncompressedSize;
	}

	public double determinCompressionRatio() {
		return uncompressed / compressed;
	}

	public double getCompressed() {
		return this.compressed;
	}

	public double getUncompressed() {
		return this.uncompressed;
	}

}
