

/*
Copyright (c) 2018-2020 Rossmann-Engineering
Permission is hereby granted, free of charge,
to any person obtaining a copy of this software
and associated documentation files (the "Software"),
to deal in the Software without restriction,
including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense,
and/or sell copies of the Software, and to permit
persons to whom the Software is furnished to do so,
subject to the following conditions:
The above copyright notice and this permission
notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.re.easymodbus.modbusclient.gui;

import de.re.easymodbus.modbusclient.ModbusClient;
import de.re.easymodbus.modbusclient.ReceiveDataChangedListener;
import de.re.easymodbus.modbusclient.SendDataChangedListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
/**
 *
 * @author Stefan Ro�mann
 */
@SuppressWarnings("serial")
public class EasyModbusTCPClientExampleGUI extends JFrame
implements ReceiveDataChangedListener , SendDataChangedListener
{
	JComboBox comboBox;
    /**
     * Creates new form EasyModbusTCPClientExampleGUI
     */
    private  ModbusClient modbusClient;
    public EasyModbusTCPClientExampleGUI() {
    	
    	
        initComponents();
        modbusClient = new ModbusClient();
        modbusClient.addReveiveDataChangedListener(this);
        modbusClient.addSendDataChangedListener(this);   
    }
    
    public void ReceiveDataChanged()
    {
        jTextArea1.append("Rx:");
        for (int i = 0; i < modbusClient.receiveData.length; i++)
        {
            jTextArea1.append(" ");
            if (modbusClient.receiveData[i] < 16) 
                jTextArea1.append("0");
            jTextArea1.append(Integer.toHexString(modbusClient.receiveData[i]));
            
        }
        jTextArea1.append("\n");
    }
    
    public void SendDataChanged()
    {
        jTextArea1.append("Tx:");
        for (int i = 0; i < modbusClient.sendData.length; i++)
        {
            jTextArea1.append(" ");
            if (modbusClient.sendData[i] < 16) 
                jTextArea1.append("0");
            jTextArea1.append(Integer.toHexString(modbusClient.sendData[i]));
        }
        jTextArea1.append("\n" );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jPanel1 = new JPanel();
        jLabel5 = new JLabel();
        jTextFieldStartingAddress = new JTextField();
        jLabel6 = new JLabel();
        jTextFieldNumberOfValues = new JTextField();
        jScrollPane1 = new JScrollPane();
        jList1 = new JList<String>();
        jLabel2 = new JLabel();
        jScrollPane2 = new JScrollPane();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton1.setText("Read Coils - FC1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Read Discrete Inputs - FC2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Read Holding Registers - FC3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Read Input Registers - FC4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel5.setText("Starting Address");

        jTextFieldStartingAddress.setText("1");

        jLabel6.setText("Number of Values");

        jTextFieldNumberOfValues.setText("1");

        jScrollPane1.setViewportView(jList1);
        
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("http://www.EasyModbusTCP.net");
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel5)
        						.addComponent(jLabel6)
        						.addComponent(jTextFieldStartingAddress, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextFieldNumberOfValues, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        					.addGap(10)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(0, 0, Short.MAX_VALUE)
        					.addComponent(jLabel2)
        					.addGap(73)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel2)
        			.addGap(56)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel5)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextFieldStartingAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jLabel6)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextFieldNumberOfValues, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);
        
        comboBox = new JComboBox();
        comboBox.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent arg0) 
        	{
        		if ((String)(arg0.getItem()) == "Modbus TCP")
        		{
        			modbusClient = new ModbusClient();
        			jpModbusTCP.setVisible(true);
        			jpModbusRTU.setVisible(false);
        		}
        		else
        		{
        			modbusClient = new ModbusClient();
        			jpModbusRTU.setVisible(true);
        			jpModbusTCP.setVisible(false);
        		}
        	}
        });
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Modbus TCP", "Modbus RTU"}));
        
        jpModbusTCP = new JPanel();
        
        jpModbusRTU = new JPanel();
        jpModbusRTU.setVisible(false);
        
        lblComport = new JLabel();
        lblComport.setText("COM-Port");
        
        txtCom = new JTextField();
        txtCom.setToolTipText("");
        txtCom.setText("COM1");
        
        textField_1 = new JTextField();
        textField_1.setText("1");
        
        lblSlaveid = new JLabel();
        lblSlaveid.setText("Slave-ID");
        GroupLayout gl_jpModbusRTU = new GroupLayout(jpModbusRTU);
        gl_jpModbusRTU.setHorizontalGroup(
        	gl_jpModbusRTU.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 174, Short.MAX_VALUE)
        		.addGroup(Alignment.TRAILING, gl_jpModbusRTU.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_jpModbusRTU.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblComport)
        				.addComponent(txtCom, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_jpModbusRTU.createParallelGroup(Alignment.TRAILING)
        				.addGroup(gl_jpModbusRTU.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblSlaveid, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        gl_jpModbusRTU.setVerticalGroup(
        	gl_jpModbusRTU.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 51, Short.MAX_VALUE)
        		.addGroup(gl_jpModbusRTU.createSequentialGroup()
        			.addGroup(gl_jpModbusRTU.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblComport)
        				.addComponent(lblSlaveid))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_jpModbusRTU.createParallelGroup(Alignment.BASELINE)
        				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtCom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jpModbusRTU.setLayout(gl_jpModbusRTU);
        jTextArea1 = new JTextArea();
        
                jTextArea1.setEditable(false);
                jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
                jTextArea1.setColumns(20);
                jTextArea1.setRows(5);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jLabel1)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGap(10)
        							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        								.addGroup(groupLayout.createSequentialGroup()
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        								.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        								.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addContainerGap()
        							.addComponent(jpModbusTCP, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addContainerGap()
        							.addComponent(jpModbusRTU, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextArea1)))
        			.addContainerGap())
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(jLabel1)
        			.addGap(11)
        			.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(7)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
        					.addComponent(jpModbusTCP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(2)
        					.addComponent(jpModbusRTU, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jButton1)
        					.addGap(11)
        					.addComponent(jButton2)
        					.addGap(11)
        					.addComponent(jButton3)
        					.addGap(11)
        					.addComponent(jButton4)))
        			.addGap(6)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextArea1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
        );
        jLabel3 = new JLabel();
        
                jLabel3.setText("IP-Address");
        jLabel4 = new JLabel();
        
                jLabel4.setText("Port");
        jTextFieldIPAddress = new JTextField();
        
                jTextFieldIPAddress.setText("127.0.0.1");
                jTextFieldIPAddress.setToolTipText("");
        jTextFieldPort = new JTextField();
        
                jTextFieldPort.setText("502");
        GroupLayout gl_jpModbusTCP = new GroupLayout(jpModbusTCP);
        gl_jpModbusTCP.setHorizontalGroup(
        	gl_jpModbusTCP.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jpModbusTCP.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_jpModbusTCP.createParallelGroup(Alignment.TRAILING)
        				.addGroup(gl_jpModbusTCP.createSequentialGroup()
        					.addComponent(jLabel3)
        					.addGap(75))
        				.addGroup(gl_jpModbusTCP.createSequentialGroup()
        					.addComponent(jTextFieldIPAddress, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(gl_jpModbusTCP.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextFieldPort, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addContainerGap())
        );
        gl_jpModbusTCP.setVerticalGroup(
        	gl_jpModbusTCP.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_jpModbusTCP.createSequentialGroup()
        			.addGroup(gl_jpModbusTCP.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jLabel4))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_jpModbusTCP.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldPort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextFieldIPAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jpModbusTCP.setLayout(gl_jpModbusTCP);
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         if (java.awt.Desktop.isDesktopSupported ()) 
         {
             java.awt.Desktop desktop = java.awt.Desktop.getDesktop ();
            if (desktop.isSupported (java.awt.Desktop.Action.BROWSE))
            {
		try
		{
			desktop.browse (new java.net.URI ("www.easymodbustcp.net"));
		}
		catch (java.io.IOException e)
		{
			e.printStackTrace ();
		}
		catch (java.net.URISyntaxException e)
		{
			e.printStackTrace ();
		}
            }
         }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (!modbusClient.isConnected())
        {
        	if (this.comboBox.getSelectedItem() == "Modbus TCP")
        	{
        		modbusClient.setipAddress(jTextFieldIPAddress.getText());
        		modbusClient.setPort(Integer.valueOf(jTextFieldPort.getText()));
        		try
        		{
        			modbusClient.Connect();
        		}
        		catch (Exception e)
        		{
        			JOptionPane.showMessageDialog(null, "Connection failed", "Connection failed", JOptionPane.OK_CANCEL_OPTION);
        		}
        	}

        }          
        DefaultListModel listModel = new DefaultListModel();
        int startingAddress = Integer.valueOf(jTextFieldStartingAddress.getText())-1;
        int numberOfValues = Integer.valueOf(jTextFieldNumberOfValues.getText());
        try
        {
            boolean[] serverResponse = modbusClient.ReadCoils(startingAddress, numberOfValues);
            for (int i = 0; i < serverResponse.length; i++)
                listModel.addElement(serverResponse[i]);
        }
        catch (Exception e)
        {
           JOptionPane.showMessageDialog(null, "Server response error", "Connection failed", JOptionPane.OK_CANCEL_OPTION);
        }        
        jList1.setModel(listModel);   
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       if (!modbusClient.isConnected())
        {
    		if (this.comboBox.getSelectedItem() == "Modbus TCP")
        	{
        		modbusClient.setipAddress(jTextFieldIPAddress.getText());
        		modbusClient.setPort(Integer.valueOf(jTextFieldPort.getText()));
        		try
        		{
        			modbusClient.setUnitIdentifier((byte)1);
        			modbusClient.Connect();
        		}
        		catch (Exception e)
        		{
        			JOptionPane.showMessageDialog(null, "Connection failed", "Connection failed", JOptionPane.OK_CANCEL_OPTION);
        		}
        	}

        }          
        DefaultListModel listModel = new DefaultListModel();
        int startingAddress = Integer.valueOf(jTextFieldStartingAddress.getText())-1;
        int numberOfValues = Integer.valueOf(jTextFieldNumberOfValues.getText());
        try
        {
            boolean[] serverResponse = modbusClient.ReadDiscreteInputs(startingAddress, numberOfValues);
            for (int i = 0; i < serverResponse.length; i++)
                listModel.addElement(serverResponse[i]);
        }
        catch (Exception e)
        {
           JOptionPane.showMessageDialog(null, "Server response error ", "Connection failed", JOptionPane.OK_CANCEL_OPTION);
        }        
        jList1.setModel(listModel);   
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       if (!modbusClient.isConnected())
        {
    		if (this.comboBox.getSelectedItem() == "Modbus TCP")
        	{
        		modbusClient.setipAddress(jTextFieldIPAddress.getText());
        		modbusClient.setPort(Integer.valueOf(jTextFieldPort.getText()));
        		try
        		{
        			modbusClient.Connect();
        		}
        		catch (Exception e)
        		{
        			JOptionPane.showMessageDialog(null, "Connection failed", "Connection failed", JOptionPane.OK_CANCEL_OPTION);
        		}
        	}

        }          
        DefaultListModel listModel = new DefaultListModel();
        int startingAddress = Integer.valueOf(jTextFieldStartingAddress.getText())-1;
        int numberOfValues = Integer.valueOf(jTextFieldNumberOfValues.getText());
        try
        {
            int[] serverResponse = modbusClient.ReadHoldingRegisters(startingAddress, numberOfValues);
            for (int i = 0; i < serverResponse.length; i++)
                listModel.addElement(serverResponse[i]);
        }
        catch (Exception e)
        {
           JOptionPane.showMessageDialog(null, "Server response error", "Connection failed", JOptionPane.OK_CANCEL_OPTION);
        }        
        jList1.setModel(listModel);   
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       if (!modbusClient.isConnected())
        {
    		if (this.comboBox.getSelectedItem() == "Modbus TCP")
        	{
        		modbusClient.setipAddress(jTextFieldIPAddress.getText());
        		modbusClient.setPort(Integer.valueOf(jTextFieldPort.getText()));
        		try
        		{
        			modbusClient.Connect();
        		}
        		catch (Exception e)
        		{
        			JOptionPane.showMessageDialog(null, "Connection failed", "Connection failed", JOptionPane.OK_CANCEL_OPTION);
        		}
        	}

        }          
        DefaultListModel listModel = new DefaultListModel();
        int startingAddress = Integer.valueOf(jTextFieldStartingAddress.getText())-1;
        int numberOfValues = Integer.valueOf(jTextFieldNumberOfValues.getText());
        try
        {
            int[] serverResponse = modbusClient.ReadInputRegisters(startingAddress, numberOfValues);
            for (int i = 0; i < serverResponse.length; i++)
                listModel.addElement(serverResponse[i]);
        }
        catch (Exception e)
        {
           JOptionPane.showMessageDialog(null, "Server response error", "Connection failed", JOptionPane.OK_CANCEL_OPTION);
        }        
        jList1.setModel(listModel);   
    }//GEN-LAST:event_jButton4MouseClicked

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EasyModbusTCPClientExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EasyModbusTCPClientExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EasyModbusTCPClientExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EasyModbusTCPClientExampleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EasyModbusTCPClientExampleGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JList<String> jList1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextArea jTextArea1;
    private JTextField jTextFieldIPAddress;
    private JTextField jTextFieldNumberOfValues;
    private JTextField jTextFieldPort;
    private JTextField jTextFieldStartingAddress;
    private JPanel jpModbusTCP;
    private JPanel jpModbusRTU;
    private JLabel lblComport;
    private JTextField txtCom;
    private JTextField textField_1;
    private JLabel lblSlaveid;
}
