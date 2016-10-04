package Huffman;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import CompressionRatio.CompressionRatio;
import Encryption.RSA;
import Encryption.SimpleEncryptor;
import Utils.BitStringToByte;
import WordChecker.WordChecker;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
	
	// bit to byte
	BitStringToByte bitStringToByte = new BitStringToByte();

	// Rsa encryption tool
	private RSA rsaEncryptor = new RSA();
	private ObjectInputStream inputStream;
	private final PublicKey publicKeyRSA;
	private final PrivateKey privateKey;

	// non-visible FileChooser
	private javax.swing.JFileChooser fc;

	// compression ratio 
	private CompressionRatio compressionRatio = new CompressionRatio();

	// word checker
	private WordChecker wordChecker = new WordChecker();

	// booleans for encryption types
	private boolean simple = true;
	private boolean rsa = false;
	private boolean publicKey = false;
	
	ArrayList<byte[]> tempByteList = new ArrayList<byte[]>();

	/**
	 * Creates new form MasterGUI
	 */
	public MasterGUI() throws IOException, ClassNotFoundException {

		// init components
		initComponents();
		initComponentsFromFCImpl();
		
		
		// Check if the pair of keys are present else generate those.
		if (!rsaEncryptor.areKeysPresent()) {
			// Method generates a pair of keys using the RSA algorithm and stores it
			// in their respective files
			rsaEncryptor.generateKey();
		}

		// Encrypt the string using the public key
		inputStream = new ObjectInputStream(new FileInputStream(rsaEncryptor.KEY_DIRECTORY + rsaEncryptor.PUBLIC_KEY_FILE));
		publicKeyRSA = (PublicKey) inputStream.readObject();

		// Decrypt the cipher text using the private key.
		inputStream = new ObjectInputStream(new FileInputStream(rsaEncryptor.KEY_DIRECTORY + rsaEncryptor.PRIVATE_KEY_FILE));
		privateKey = (PrivateKey) inputStream.readObject();

		String text = "bibless\n" +
					  "pickeer\n" +
					  "alecost\n" +
					  "Morelos\n" +
					  "fragile\n" +
					  "isogyre\n" +
					  "startor\n" +
					  "knouted\n" +
					  "tribuna\n" +
					  "Osswald";
		
		text = encode(text);
		
		ArrayList<byte[]> b = rsaEncryptor.encrypt(text, publicKeyRSA);
		ArrayList<byte[]> ans = new ArrayList<byte[]>();
		ArrayList<byte[]> holder = new ArrayList<byte[]>();
		String yes = "";
		
		for (byte[] blah : b) {
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
		
		
		List<String> tempStringList = bitStringToByte.splitEqually(result, 8);
		String real = "";
		for (String s : tempStringList) {
			int charCode = Integer.parseInt(s, 2);
			String str = new Character((char)charCode).toString();
			real += str;
		}
		
		yes += hc.decode(real, tree);
		
		
		

		JOptionPane.showMessageDialog(null,
				"\"" + text + "\"" + " is encrypted to: " + rsaEncryptor.encrypt(text, publicKeyRSA) + "\n is decrypted to: " + yes,
				"Encrypted/Decrypted Tester", JOptionPane.INFORMATION_MESSAGE);



	}

	/**
	 *
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

	private void initComponentsFromFCImpl() {
		fc = new javax.swing.JFileChooser();
		fc.setFileFilter(new CustomFilter());

		// add the buttons to the group
		encryptionType.add(simpleEncryptionType);
		encryptionType.add(rsaType);
		encryptionType.add(publicKeyCryptoSystemType);

		// enable the first selection upon start
		encryptionType.setSelected(simpleEncryptionType.getModel(), rsa);

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
        publicKeyCryptoSystemType = new javax.swing.JRadioButton();
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

        publicKeyCryptoSystemType.setText("Public-Key Cryptosystem");
        publicKeyCryptoSystemType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publicKeyCryptoSystemTypeActionPerformed(evt);
            }
        });

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
                        .addComponent(decodeDecryptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(encodeEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(decodeDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(simpleEncryptionType)
                                .addGap(18, 18, 18)
                                .addComponent(rsaType)
                                .addGap(18, 18, 18)
                                .addComponent(publicKeyCryptoSystemType))
                            .addComponent(treeViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(simpleEncryptionType)
                        .addComponent(rsaType)
                        .addComponent(publicKeyCryptoSystemType))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(decodeDecrypt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(encodeEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(treeViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE))
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
			//JOptionPane.showMessageDialog(null, 
			//  "\"" + text + "\"" + " is encoded to: " + hc.encode(text, codes),
			//  "Encoded Text to Bits", JOptionPane.INFORMATION_MESSAGE);

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
			//JOptionPane.showMessageDialog(null, 
			//  bits + ": is decoded to " + "\"" + text + "\"",
			//  "Decoded Bits to Text", JOptionPane.INFORMATION_MESSAGE);
		}

    }//GEN-LAST:event_decodeDecryptBtnActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
		int returnVal = fc.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			try {
				// What to do with the file (i.e. display it in a textArea)
				textArea.read(new FileReader(file.getAbsolutePath()), null);

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
				FileWriter fw = new FileWriter(fc.getSelectedFile().getName());

				// read the file and save to the file name the user chose
				String content = textArea.getText();
				writeFile(fileName, content);

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
				compressionRatio.setUncompressed(textArea.getText().length());
				String encodedText = encode(textArea.getText());
				compressionRatio.setCompressed(encodedText.length());

				String encryptionText;
				// this is a temporary if statement that will be set to true
				// it is going to determine which decryption method we will use later on
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
					
					List<String> tempStringList = bitStringToByte.splitEqually(result, 8);
					String finalResult = "";
					
					for (String s : tempStringList) {
						byte[] b = new BigInteger(s, 2).toByteArray();
						
						for (byte B : b) {
							Character c = (char) B;
							finalResult += c;
						}
					}
					

					encryptionText = finalResult;

				} else if (publicKeyCryptoSystemType.isSelected()) {
					encryptionText = simpleEncryptor.encrypt(key, encodedText);
				} else {
					encryptionText = simpleEncryptor.encrypt(key, encodedText);
				}

				textArea.setText(encryptionText);

				String fileName = fc.getSelectedFile().getName();
				// set the current directory
				fc.setCurrentDirectory(fc.getCurrentDirectory());
				fw = new FileWriter(fc.getSelectedFile().getName());
				// write the file
				if (wordChecker.checkIfFileExists(fc.getSelectedFile().getName())) {
					// TODO - LENDER - convert from string of byte arrays to bits
					if (rsaType.isSelected()) {
						File tmpFile = new File(fc.getSelectedFile().getName() + ".bak");
						writeFile(tmpFile.getName(), encryptionText);
						// Display the compression ratio to the user
						JOptionPane.showMessageDialog(null,
								"The compression ratio is: " + compressionRatio.getUncompressed() + " / " + compressionRatio.getCompressed() + " = " + compressionRatio.determinCompressionRatio(),
								"Compression Ratio",
								JOptionPane.INFORMATION_MESSAGE);

						tmpFile.renameTo(fc.getSelectedFile());
					} else {
						File tmpFile = new File(fc.getSelectedFile().getName() + ".bak");
						writeFile(tmpFile.getName(), encryptionText);
						// Display the compression ratio to the user
						JOptionPane.showMessageDialog(null,
								"The compression ratio is: " + compressionRatio.getUncompressed() + " / " + compressionRatio.getCompressed() + " = " + compressionRatio.determinCompressionRatio(),
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

				
				// this is a temporary if statement that will be set to true
				// it is going to determine which decryption method we will use later on
				if (simpleEncryptionType.isSelected()) {
					decryptionText = simpleEncryptor.decrypt(key, bits);
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

				List<String> tempStringList = bitStringToByte.splitEqually(result, 8);
				String real = "";
				for (String s : tempStringList) {
					int charCode = Integer.parseInt(s, 2);
					String str = new Character((char)charCode).toString();
					real += str;
				}

				decryptionText += hc.decode(real, tree);

			} else if (publicKeyCryptoSystemType.isSelected()) {
				decryptionText = simpleEncryptor.decrypt(key, bits);
			} else {
				decryptionText = simpleEncryptor.decrypt(key, bits);
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
					if (wordChecker.checkIfFileExists(fc.getSelectedFile().getName())) {
						File tmpFile = new File(fileName + ".bak");
						writeFile(tmpFile.getName(), text);
						tmpFile.renameTo(fc.getSelectedFile());
					} else {
						writeFile(fileName, text);
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

    private void publicKeyCryptoSystemTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publicKeyCryptoSystemTypeActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_publicKeyCryptoSystemTypeActionPerformed

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
			return sb.toString();
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
    private javax.swing.JMenuItem Open;
    private javax.swing.JButton decodeDecrypt;
    private javax.swing.JButton decodeDecryptBtn;
    private javax.swing.JTextField decodeDecryptText;
    private javax.swing.JButton encodeEncrypt;
    private javax.swing.JButton encodeEncryptBtn;
    private javax.swing.ButtonGroup encryptionType;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButton publicKeyCryptoSystemType;
    private javax.swing.JRadioButton rsaType;
    private javax.swing.JMenuItem save;
    private javax.swing.JRadioButton simpleEncryptionType;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textToEncodeEcrypt;
    private java.awt.ScrollPane treeViewer;
    // End of variables declaration//GEN-END:variables
}
