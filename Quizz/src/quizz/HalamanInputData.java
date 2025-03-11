package quizz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.*;


public class HalamanInputData extends JFrame implements ActionListener{
    JLabel dnama = new JLabel("Nama Depan : ");
    JLabel bnama = new JLabel("Nama Belakang : ");
    JTextField dnamaTextField = new JTextField();
    JTextField bnamaTextField = new JTextField();
    JLabel ldivisi = new JLabel("Divisi : ");
    String[] namaDivisi = {"IT", "HRD", "Finance", "Marketing"};
    JComboBox cmbDivisi = new JComboBox(namaDivisi);
    JLabel ljenisKelamin = new JLabel("Jenis Kelamin : ");
    JRadioButton rbPria = new JRadioButton("Pria");
    JRadioButton rbWanita = new JRadioButton("Wanita");
    JButton btnSimpan = new JButton("Simpan Data");
    JLabel list = new JLabel("List Data : ");
    JTextArea ta = new JTextArea();
    JScrollPane sp = new JScrollPane(ta);
    ArrayList<String> dataList = new ArrayList<>();
    JCheckBox cb = new JCheckBox("Ingin melakukan Import/Export Data ?");
    JButton itext = new JButton("Import from Txt");
    JButton etext = new JButton("Export to Txt");
    
    public HalamanInputData(){
        setTitle("Input Member by Salsa");
        setSize(450,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        setLayout(null);
        add(dnama);
        add(bnama);
        add(dnamaTextField);
        add(bnamaTextField);
        add(ldivisi);
        add(cmbDivisi);
        add(ljenisKelamin);
        add(rbPria);
        add(rbWanita);
        add(btnSimpan);
        add(list);
        add(ta);
        add(sp);
        add(cb);
        add(itext);
        add(etext);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbPria);
        genderGroup.add(rbWanita);
        
        dnama.setBounds(10,5,200,20);
        bnama.setBounds(200,5,200,20);
        dnamaTextField.setBounds(10,30,180,20);
        bnamaTextField.setBounds(200,30,180,20);
        ldivisi.setBounds(10,65,100,20);
        cmbDivisi.setBounds(10,85,410,20);
        ljenisKelamin.setBounds(20,110,100,20);
        rbPria.setBounds(120,135,60,20);
        rbWanita.setBounds(190,135,80,20);
        btnSimpan.setBounds(10,180,410,35);
        btnSimpan.addActionListener(this);
        list.setBounds(10,250,100,20);
        ta.setBounds(10,275,410,200);
        sp.setBounds(10,275,410,200);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        cb.setBounds(10,480,250,20);
        itext.setBounds(10,500,150,20);
        etext.setBounds(250,500,150,20);
     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSimpan){
            String namaDepan = dnamaTextField.getText();
            String namaBelakang = bnamaTextField.getText();
            
            String divisi = cmbDivisi.getName();
            
            if(!namaDepan.isEmpty() && !namaBelakang.isEmpty()){
                String data = namaDepan + " " + namaBelakang + " | " +  divisi; 
                dataList.add(data);
                ta.append(data + "\n");
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan.", "Sukses" , JOptionPane.INFORMATION_MESSAGE);     
            } else {
                JOptionPane.showMessageDialog(this, "Data Belum Lengkap.", "Gagal" , JOptionPane.ERROR_MESSAGE);
            }
           
            if(e.getSource() == cb){
                String check = cb.getText();
               
            } else if(e.getSource() == etext){
                
            }
                
        }
    }
}
