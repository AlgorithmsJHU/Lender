package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Encryption.PrivatePublicKey;
import Encryption.RSA;
import Encryption.SimpleEncryptor;
import Huffman.HuffmanCode;
import Huffman.HuffmanTree;
import Huffman.Tree;
import Huffman.TreeView;
import LZW.LZW;
import Utils.Utilities;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author glender
 */
public class MasterGUI extends javax.swing.JFrame {

	private TreeView treeView = new TreeView();
	private Tree tree = new Tree();
	private HuffmanTree huffmanTree = new HuffmanTree();
	private HuffmanCode hc = new HuffmanCode();

	// Simple encryption key and tool
	private String key = "simpleKey";
	private SimpleEncryptor simpleEncryptor = new SimpleEncryptor();

	// String splitter
	Utilities utils = new Utilities();

	// Rsa encryption tool
	private RSA rsaEncryptor = new RSA();
	private ObjectInputStream inputStream;
	private final PublicKey publicKeyRSA;
	private final PrivateKey privateKey;

	// non-visible FileChooser
	private javax.swing.JFileChooser fc;

	// booleans for encryption types
	private boolean simple = true;
	private boolean rsa = false;
	private boolean publicKey = false;

	// booleans for IO types
	private boolean textBool = true;
	private boolean binaryBool = false;

	// booleans for encoding/decoding types
	private boolean huffman = true;
	private boolean lzw = false;

	// encoding / decoding for LZW
	private LZW lzwEnDe = new LZW();
	private List<Integer> lzwList = new ArrayList<Integer>();
	private List<Integer> lzwCharsOnlyList = new ArrayList<Integer>();
	
	// public-key crypto
	private PrivatePublicKey ppk = new PrivatePublicKey();
	private String encrypted;
	private Key k;
	private SecureRandom random;
	private IvParameterSpec iv;
	
	ArrayList<byte[]> tempByteList = new ArrayList<byte[]>();

	/**
	 * Creates new form MasterGUI
	 */
	public MasterGUI() throws IOException, ClassNotFoundException {

		// init components
		initComponents();
		initComponentsFromFC();

		// Check if the pair of keys are present else generate those.
		if (!rsaEncryptor.areKeysPresent()) {
			// Method generates a pair of keys using the RSA algorithm and stores it
			// in their respective files
			rsaEncryptor.generateKey();
			rsaEncryptor.setKeysSet(true);
		}

		// Encrypt the string using the public key
		inputStream = new ObjectInputStream(new FileInputStream(rsaEncryptor.KEY_DIRECTORY + rsaEncryptor.PUBLIC_KEY_FILE));
		publicKeyRSA = (PublicKey) inputStream.readObject();

		// Decrypt the cipher text using the private key.
		inputStream = new ObjectInputStream(new FileInputStream(rsaEncryptor.KEY_DIRECTORY + rsaEncryptor.PRIVATE_KEY_FILE));
		privateKey = (PrivateKey) inputStream.readObject();
		
		try {
			k = ppk.generateKey();
		} catch (NoSuchAlgorithmException ex) {
			Logger.getLogger(MasterGUI.class.getName()).log(Level.SEVERE, null, ex);
		}
		random = new SecureRandom();
		iv = new IvParameterSpec(random.generateSeed(16));
		
	}

	/**
	 * Defines the custom filter for the FileChooser
	 */
	class CustomFilter extends javax.swing.filechooser.FileFilter {

		@Override
		public boolean accept(File file) {
			// Allow only directories, or files with ".txt" extension
			return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
		}

		@Override
		public String getDescription() {
			// This description will be displayed in the dialog,
			// hard-coded = ugly, should be done via I18N
			return "Text documents (*.txt)";
		}
	}

	private void initComponentsFromFC() {
		fc = new javax.swing.JFileChooser();
		fc.setFileFilter(new CustomFilter());

		// add the buttons to the group
		encryptionType.add(simpleEncryptionType);
		encryptionType.add(rsaType);
		encryptionType.add(pkcryptoType);

		// add the buttons to the group
		IOType.add(textBtn);
		IOType.add(binaryBtn);

		// add the buttons to the group
		codingType.add(huffmanBtn);
		codingType.add(lzwBtn);

		// enable the first selection upon start
		encryptionType.setSelected(simpleEncryptionType.getModel(), rsa);
		simpleEncryptionType.setSelected(rsa);

		// enable the first selection upon start
		IOType.setSelected(textBtn.getModel(), textBool);
		textBtn.setSelected(textBool);

		// enable the first selection upon start
		codingType.setSelected(huffmanBtn.getModel(), huffman);
		huffmanBtn.setSelected(huffman);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        encryptionType = new javax.swing.ButtonGroup();
        IOType = new javax.swing.ButtonGroup();
        codingType = new javax.swing.ButtonGroup();
        encodeEncryptBtn = new javax.swing.JButton();
        textToEncodeEcrypt = new javax.swing.JTextField();
        decodeDecryptText = new javax.swing.JTextField();
        decodeDecryptBtn = new javax.swing.JButton();
        treeViewer = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        encodeEncrypt = new javax.swing.JButton();
        decodeDecrypt = new javax.swing.JButton();
        simpleEncryptionType = new javax.swing.JRadioButton();
        rsaType = new javax.swing.JRadioButton();
        textBtn = new javax.swing.JRadioButton();
        binaryBtn = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        huffmanBtn = new javax.swing.JRadioButton();
        lzwBtn = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        pkcryptoType = new javax.swing.JRadioButton();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        encodeEncryptBtn.setAction(textToEncodeEcrypt.getAction());
        encodeEncryptBtn.setText("Encode/Encrypt");
        encodeEncryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeEncryptBtnActionPerformed(evt);
            }
        });

        textToEncodeEcrypt.setColumns(1);
        textToEncodeEcrypt.setText("Enter Text for Encoding and Encryption");
        textToEncodeEcrypt.setToolTipText("Text in this field will be encode and ecrypted.");

        decodeDecryptText.setText("Enter Text for Decoding and Decryption");
        decodeDecryptText.setToolTipText("Enter text to be decoded and decrypted");

        decodeDecryptBtn.setAction(decodeDecryptText.getAction());
        decodeDecryptBtn.setText("Decode/Decrypt");
        decodeDecryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeDecryptBtnActionPerformed(evt);
            }
        });

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textArea);

        encodeEncrypt.setText("Encode/Encrypt");
        encodeEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encodeEncryptActionPerformed(evt);
            }
        });

        decodeDecrypt.setText("Decode/Decrypt");
        decodeDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeDecryptActionPerformed(evt);
            }
        });

        simpleEncryptionType.setSelected(true);
        simpleEncryptionType.setText("Simple Encryption");
        simpleEncryptionType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleEncryptionTypeActionPerformed(evt);
            }
        });

        rsaType.setText("RSA");
        rsaType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsaTypeActionPerformed(evt);
            }
        });

        textBtn.setText("Text");

        binaryBtn.setText("Binary");

        jLabel1.setText("Encryption Type");

        jLabel2.setText("I/O:");

        huffmanBtn.setText("Huffman");

        lzwBtn.setText("LZW");

        jLabel3.setText("Encode / Decode Type:");

        pkcryptoType.setText("Public-Key Crypto");

        jMenu1.setText("File");

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jMenu1.add(save);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(textToEncodeEcrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(encodeEncryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decodeDecryptText, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decodeDecryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(encodeEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(decodeDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(treeViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(simpleEncryptionType)
                                    .addComponent(huffmanBtn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rsaType)
                                        .addGap(18, 18, 18)
                                        .addComponent(pkcryptoType)
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel2)
                                        .addGap(3, 3, 3)
                                        .addComponent(textBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(binaryBtn))
                                    .addComponent(lzwBtn))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huffmanBtn)
                    .addComponent(lzwBtn)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(simpleEncryptionType)
                        .addComponent(rsaType)
                        .addComponent(textBtn)
                        .addComponent(binaryBtn)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(pkcryptoType))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(decodeDecrypt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(encodeEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(treeViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(decodeDecryptText)
                            .addComponent(textToEncodeEcrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(decodeDecryptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(encodeEncryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        treeViewer.getAccessibleContext().setAccessibleParent(treeViewer);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encodeEncryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeEncryptBtnActionPerformed
		String text = textToEncodeEcrypt.getText();
		encode(text);
    }//GEN-LAST:event_encodeEncryptBtnActionPerformed

	private String encode(String text) {
		String codes[];

		// we will assume that all our characters will have
		// code less than 256, for simplicity
		int[] charFreqs = new int[256];
		// read each character and record the frequencies
		for (char c : text.toCharArray()) {
			charFreqs[c]++;
		}

		// build tree
		huffmanTree = hc.buildTree(charFreqs);

		tree = treeView.getHuffmanTree(charFreqs);
		treeView.setTree(tree);

		// add the treeViwer, so that we can see the tree
		treeViewer.add(treeView);

		if (text.length() == 0) {
			JOptionPane.showMessageDialog(null, "No text");
			return "";
		} else {
			codes = hc.getCode(tree.root);
			return hc.encode(text, codes);
		}

	}

    private void decodeDecryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeDecryptBtnActionPerformed
		String bits = decodeDecryptText.getText();

		if (tree == null) {
			JOptionPane.showMessageDialog(null, "No tree");
		} else if (bits.length() == 0) {
			JOptionPane.showMessageDialog(null, "No codes");
		} else {
			String text = hc.decode(bits, tree);
			if (text == null) {
				JOptionPane.showMessageDialog(null, "Incorrect bits ");
			} else {
				System.out.println();
			}
		}

    }//GEN-LAST:event_decodeDecryptBtnActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
		int returnVal = fc.showOpenDialog(this);
		// clear the text field
		textArea.setText("");

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			try {
				// What to do with the file (i.e. display it in a textArea)
				textArea.setText(readFile(file.getAbsolutePath()));

				//textArea.read(new FileReader(file.getAbsolutePath()), null);

			} catch (IOException ex) {
				System.out.println("problem accessing file" + file.getAbsolutePath());
			}
		} else {
			System.out.println("File access cancelled by user.");
		}
    }//GEN-LAST:event_OpenActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
		int returnVal = fc.showSaveDialog(save);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try {
				String fileName = fc.getSelectedFile().getName();

				// set the current directory
				fc.setCurrentDirectory(fc.getCurrentDirectory());
				
				if (textBtn.isSelected()) {
					FileWriter fw = new FileWriter(fc.getSelectedFile().getName());

					// read the file and save to the file name the user chose
					String content = textArea.getText();
					
					writeFile(fileName, content);
				} else {
					FileWriter fw = new FileWriter(fc.getSelectedFile().getName());

					// read the file and save to the file name the user chose
					String content = textArea.getText();
					String newName = stripFileExtension(fileName);
					newName += ".bin";
					writeFile(newName, content, true);

				}

			} catch (IOException ex) {
				Logger.getLogger(MasterGUI.class.getName()).log(Level.SEVERE, null, ex);
			}
		} else {
			System.out.println("File access cancelled by user.");
		}
    }//GEN-LAST:event_saveActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
		System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void encodeEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encodeEncryptActionPerformed
		FileWriter fw = null;
		try {

			if (null != textArea.getText()) {

				// set the compression data
				utils.compressionRatio.setUncompressed(textArea.getText().length());

				String encodedText = "";
				// which encoding method should we use? 
				if (huffmanBtn.isSelected()) {
					encodedText = encode(textArea.getText());
				} else {

					lzwList = lzwEnDe.compress(textArea.getText());
					
					// Filter out newlines
					lzwList.stream().filter((integer) -> (integer != 10)).forEach((integer) -> {
						lzwCharsOnlyList.add(integer);
					});

					// create the encoded string from the encoded list of integers
					encodedText = lzwList.stream().map((integer) -> integer.toString()).reduce(encodedText, String::concat);

				}

				utils.compressionRatio.setCompressed(encodedText.length());

				String encryptionText = "";
				// which encryption method should we use? 
				if (simpleEncryptionType.isSelected()) {
					encryptionText = simpleEncryptor.encrypt(key, encodedText);
				} else if (rsaType.isSelected()) {

					tempByteList.addAll(rsaEncryptor.encrypt(encodedText, publicKeyRSA));
					String result = "";

					for (byte[] b : tempByteList) {
						for (byte BYTE : b) {
							byte tempByte = BYTE;
							result += String.format("%8s", Integer.toBinaryString(tempByte & 0xFF)).replace(' ', '0');
						}
					}

					List<String> tempStringList = utils.bitStringToByte.splitEqually(result, 8);
					String finalResult = "";

					for (String s : tempStringList) {
						byte[] b = new BigInteger(s, 2).toByteArray();

						for (byte B : b) {
							Character c = (char) B;
							finalResult += c;
						}
					}

					encryptionText = finalResult;

				} else if (pkcryptoType.isSelected()) {
					encryptionText = ppk.encrypt(encodedText, k, iv);
					encrypted = encryptionText;
				} else {
					// default to the simpleEncryptor
					encryptionText = simpleEncryptor.encrypt(key, encodedText);
				}

				textArea.setText(encryptionText);

				String fileName = fc.getSelectedFile().getName();
				// set the current directory
				fc.setCurrentDirectory(fc.getCurrentDirectory());
				fw = new FileWriter(fc.getSelectedFile().getName());
				// write the file
				if (utils.wordChecker.checkIfFileExists(fc.getSelectedFile().getName())) {
					
					if (rsaType.isSelected()) {
						File tmpFile = new File(fc.getSelectedFile().getName() + ".bak");
						
						if (textBtn.isSelected()) {
							writeFile(tmpFile.getName(), encryptionText);
							tmpFile.renameTo(fc.getSelectedFile());
						} else {
							try {
								
								writeFile(tmpFile.getName(), encryptionText, true);
								String newName = stripFileExtension(fc.getSelectedFile().getName());
								newName += ".bin";
								tmpFile.renameTo(new File(newName));

							} catch (Exception ex) {
								Logger.getLogger(MasterGUI.class.getName()).log(Level.SEVERE, null, ex);
							}
						}
						// Display the compression ratio to the user
						JOptionPane.showMessageDialog(null,
								"The compression ratio is: " + utils.compressionRatio.getUncompressed() + " / " + utils.compressionRatio.getCompressed() + " = " + utils.compressionRatio.determinCompressionRatio(),
								"Compression Ratio",
								JOptionPane.INFORMATION_MESSAGE);

						
					} else {
						File tmpFile = new File(fc.getSelectedFile().getName() + ".bak");
						
						if (textBtn.isSelected()) {
							writeFile(tmpFile.getName(), encryptionText);
						} else {
							writeFile(tmpFile.getName(), encryptionText, true);

						}
						// Display the compression ratio to the user
						JOptionPane.showMessageDialog(null,
								"The compression ratio is: " + utils.compressionRatio.getUncompressed() + " / " + utils.compressionRatio.getCompressed() + " = " + utils.compressionRatio.determinCompressionRatio(),
								"Compression Ratio",
								JOptionPane.INFORMATION_MESSAGE);

						tmpFile.renameTo(fc.getSelectedFile());
					}
				} else {
					writeFile(fileName, encodedText);
				}
			}

		} catch (IOException ex) {
			Logger.getLogger(MasterGUI.class.getName()).log(Level.SEVERE, null, ex);
		} catch (Exception ex) {
			Logger.getLogger(MasterGUI.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				if (null != fw) {
					fw.close();
				}
			} catch (IOException ex) {
				Logger.getLogger(MasterGUI.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
    }//GEN-LAST:event_encodeEncryptActionPerformed

    private void decodeDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeDecryptActionPerformed
		FileWriter fw = null;
		ArrayList<byte[]> byteList = new ArrayList<byte[]>();
		ArrayList<byte[]> realByteList = new ArrayList<byte[]>();
		String bits = textArea.getText();
		String decryptionText = "";

		if (tree == null) {
			JOptionPane.showMessageDialog(null, "No tree");
		} else if (bits.length() == 0) {
			JOptionPane.showMessageDialog(null, "No codes");
		} else {

			// which decryption method should we use?
			if (simpleEncryptionType.isSelected()) {
				decryptionText = simpleEncryptor.decrypt(key, bits);

				String result = "";
				for (byte BYTE : decryptionText.getBytes()) {
					byte tempByte = BYTE;
					result += String.format("%8s", Integer.toBinaryString(tempByte & 0xFF)).replace(' ', '0');
				}

				List<String> tempStringList = utils.bitStringToByte.splitEqually(result, 8);
				String real = "";
				String realLZW = "";
				for (String s : tempStringList) {
					int charCode = Integer.parseInt(s, 2);
					String str = new Character((char) charCode).toString();
					real += str;
					realLZW += str + " ";
				}

				// clear the decryptionText
				decryptionText = "";

				// which decoding method?
				if (huffmanBtn.isSelected()) {
					decryptionText += hc.decode(real, tree);
				} else {
					decryptionText = lzwEnDe.decompress(lzwList);
				}

			} else if (rsaType.isSelected()) {

				ArrayList<byte[]> ans = new ArrayList<byte[]>();
				ArrayList<byte[]> holder = new ArrayList<byte[]>();
				String yes = "";

				for (byte[] blah : tempByteList) {
					ans = (rsaEncryptor.decrypt(blah, privateKey));
					for (byte[] by : ans) {
						holder.add(by);
					}
				}

				String result = "";
				for (byte[] bb : holder) {
					for (byte BYTE : bb) {
						byte tempByte = BYTE;
						result += String.format("%8s", Integer.toBinaryString(tempByte & 0xFF)).replace(' ', '0');
					}
				}

				List<String> tempStringList = utils.bitStringToByte.splitEqually(result, 8);
				String real = "";
				for (String s : tempStringList) {
					int charCode = Integer.parseInt(s, 2);
					String str = new Character((char) charCode).toString();
					real += str;
				}

				// which decoding method?
				if (huffmanBtn.isSelected()) {
					decryptionText += hc.decode(real, tree);
				} else {
					decryptionText = lzwEnDe.decompress(lzwList);
				}

			} else if (pkcryptoType.isSelected()) {
				
				String decrypted = "";
				try {
					decrypted = ppk.decrypt(encrypted, k, iv);
				} catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException | IOException | InvalidAlgorithmParameterException ex) {
					Logger.getLogger(MasterGUI.class.getName()).log(Level.SEVERE, null, ex);
				}

				String decrypt = decrypted;

				// which decoding method?
				if (huffmanBtn.isSelected()) {
					decryptionText += hc.decode(decrypt, tree);
				} else {
					decryptionText = lzwEnDe.decompress(lzwList);
				}
				
				
			} else {
				// default
				decryptionText = simpleEncryptor.decrypt(key, bits);

				String result = "";
				for (byte BYTE : decryptionText.getBytes()) {
					byte tempByte = BYTE;
					result += String.format("%8s", Integer.toBinaryString(tempByte & 0xFF)).replace(' ', '0');
				}

				List<String> tempStringList = utils.bitStringToByte.splitEqually(result, 8);
				String real = "";
				for (String s : tempStringList) {
					int charCode = Integer.parseInt(s, 2);
					String str = new Character((char) charCode).toString();
					real += str;
				}

				// clear the decryptionText
				decryptionText = "";

				// which decoding method?
				if (huffmanBtn.isSelected()) {
					decryptionText += hc.decode(real, tree);
				} else {
					decryptionText = lzwEnDe.decompress(lzwList);
				}

			}

			String text = decryptionText;

			if (text == null) {
				JOptionPane.showMessageDialog(null, "Incorrect bits ");
			} else {
				try {
					//JOptionPane.showMessageDialog(null,
					//		bits + ": is decoded to " + "\"" + text + "\"",
					//		"Decoded Bits to Text", JOptionPane.INFORMATION_MESSAGE);

					textArea.setText(text);

					String fileName = fc.getSelectedFile().getName();
					// set the current directory
					fc.setCurrentDirectory(fc.getCurrentDirectory());
					fw = new FileWriter(fc.getSelectedFile().getName());
					
					// write the file, write to bak then rename
					if (utils.wordChecker.checkIfFileExists(fc.getSelectedFile().getName())) {
						File tmpFile = new File(fileName + ".bak");
						
						if (textBtn.isSelected()) {
							writeFile(tmpFile.getName(), text);
						} else {
							writeFile(tmpFile.getName(), text, true);
							String newName = stripFileExtension(fc.getSelectedFile().getName());
							newName += ".bin";
							tmpFile.renameTo(new File(newName));
						}
						
						tmpFile.renameTo(fc.getSelectedFile());
					} else {
						if (textBtn.isSelected()) {
							writeFile(fileName, text);
						} else {
							String newName = stripFileExtension(fc.getSelectedFile().getName());
							newName += ".bin";
							writeFile(fileName, text, true);
						}
					}
				} catch (IOException ex) {
					Logger.getLogger(MasterGUI.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
    }//GEN-LAST:event_decodeDecryptActionPerformed

    private void simpleEncryptionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpleEncryptionTypeActionPerformed
    }//GEN-LAST:event_simpleEncryptionTypeActionPerformed

    private void rsaTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsaTypeActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_rsaTypeActionPerformed

	/**
	 * Save the given text to the given filename.
	 *
	 * @param canonicalFilename Like /home/garrett/git/Code/blah.txt
	 * @param text All the text you want to save to the file as one String.
	 * @throws IOException
	 */
	public static void writeFile(String canonicalFilename, String text) throws IOException {
		File file = new File(canonicalFilename);
		try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
			out.write(text);
		}
	}
	
	/**
	 * Strips extension from the file name.
	 * @param fileName
	 * @return 
	 */
	public static String stripFileExtension(String fileName) {
		int dotInd = fileName.lastIndexOf('.');

		// if dot is in the first position,
		// we are dealing with a hidden file rather than an extension
		return (dotInd > 0) ? fileName.substring(0, dotInd) : fileName;
	}
	
	/**
	 * Save the given text to the given filename.
	 *
	 * @param canonicalFilename Like /home/garrett/git/Code/blah.txt
	 * @param text All the text you want to save to the file as one String.
	 * @throws IOException
	 */
	public static void writeFile(String canonicalFilename, String text, boolean binary) throws IOException {
		
		File file = new File(canonicalFilename);
		if (!binary) {
			try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
				out.write(text);
			}
		} else {
			try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
				byte[] bytes = text.getBytes();
				StringBuilder stringBuilder = new StringBuilder();
				
				for (byte b : bytes) {
					int value = b;
					
					for (int index = 0; index < 8; index++) {
						stringBuilder.append((value & 128) == 0 ? 0 : 1);
						value <<= 1;
					}
					
				}
				
				out.write(stringBuilder.toString());
			}
		}
	}

	/**
	 *
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public String readFile(String fileName) throws IOException {
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			if (textBtn.isSelected()) {
				return sb.toString();
			} else {
				String output = "";
				for (int index = 0; index <= sb.toString().length() - 8; index += 8) {
					int character = Integer.parseInt(sb.toString().substring(index, index + 8), 2);
					output += (char) character;
				}
				
				return output;
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MasterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			try {
				new MasterGUI().setVisible(true);
			} catch (IOException ex) {
				Logger.getLogger(MasterGUI.class.getName()).log(Level.SEVERE, null, ex);
			} catch (ClassNotFoundException ex) {
				Logger.getLogger(MasterGUI.class.getName()).log(Level.SEVERE, null, ex);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.ButtonGroup IOType;
    private javax.swing.JMenuItem Open;
    private javax.swing.JRadioButton binaryBtn;
    private javax.swing.ButtonGroup codingType;
    private javax.swing.JButton decodeDecrypt;
    private javax.swing.JButton decodeDecryptBtn;
    private javax.swing.JTextField decodeDecryptText;
    private javax.swing.JButton encodeEncrypt;
    private javax.swing.JButton encodeEncryptBtn;
    private javax.swing.ButtonGroup encryptionType;
    private javax.swing.JRadioButton huffmanBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lzwBtn;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButton pkcryptoType;
    private javax.swing.JRadioButton rsaType;
    private javax.swing.JMenuItem save;
    private javax.swing.JRadioButton simpleEncryptionType;
    private javax.swing.JTextArea textArea;
    private javax.swing.JRadioButton textBtn;
    private javax.swing.JTextField textToEncodeEcrypt;
    private java.awt.ScrollPane treeViewer;
    // End of variables declaration//GEN-END:variables
}
