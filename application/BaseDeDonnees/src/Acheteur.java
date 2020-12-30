import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class Acheteur {
    private int id_utilisateur;
    // type = 0 si annonceur et =1 si acheteur.

    Acheteur(int id) {

//	     private final List<String> arrayCategorie=new ArrayList<String>();
        //  private final List<String> arrayRegion=new ArrayList<String>();
        //recuperer les valeurs transmises lors de la connexion.
        this.id_utilisateur=id;


        final DefaultListModel modelCategorie = new DefaultListModel();
        final DefaultListModel modelRegion = new DefaultListModel();
        JFrame f = new JFrame("Acheteur");//Créer un objet graphique.
        f.setTitle("Achèteur");
        f.setSize(900, 1000);    //Définir la taille de l'objet graphique.
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pRechercher_Prodiut = new JPanel();
        String title = "Rechercher un produit";
        Border border = BorderFactory.createTitledBorder(title);
        ((TitledBorder) border).setTitleFont(new Font("Serif", Font.BOLD, 20));
        pRechercher_Prodiut.setBorder(border);
        pRechercher_Prodiut.setLocation(15, 15);
        pRechercher_Prodiut.setSize(530, 210) ;
        pRechercher_Prodiut.setLayout(null);
        f.add(pRechercher_Prodiut);

        JPanel pMes_achat = new JPanel();
        String titleMes_Achat = "Mes achat";
        Border borderMes_Achat = BorderFactory.createTitledBorder(titleMes_Achat);
        ((TitledBorder) borderMes_Achat).setTitleFont(new Font("Serif", Font.BOLD, 20));
        pMes_achat.setBorder(borderMes_Achat);
        pMes_achat.setLocation(545, 15 ) ;
        pMes_achat.setSize(340, 210) ;
        pMes_achat.setLayout(null);
        f.add(pMes_achat);

        JButton JbSoumettre = new JButton("Soumettre");      //Créer un bouton.
        JbSoumettre.setBounds(350, 230, 200, 50);                   //Définir la taille du bouton.
        JbSoumettre.setFont(new Font("Serif", Font.BOLD, 17));    //Définir le font.
        f.add(JbSoumettre);

        JButton JbMesOffre = new JButton("Mes Offre");      //Créer un bouton.
        JbMesOffre.setBounds(80, 50, 200, 50);                   //Définir la taille du bouton.
        JbMesOffre.setFont(new Font("Serif", Font.BOLD, 17));    //Définir le font.
        pMes_achat.add(JbMesOffre);

        JButton JbHistoriqueVente = new JButton("Mes achats");      //Créer un bouton.
        JbHistoriqueVente.setBounds(80, 125, 200, 50);                   //Définir la taille du bouton.
        JbHistoriqueVente.setFont(new Font("Serif", Font.BOLD, 17));    //Définir le font.
        pMes_achat.add(JbHistoriqueVente);


       // JLabel labelCategorie = new JLabel("Categorie : ");       //créer les Labels.
     //  JLabel labelCategorie = new JLabel(Integer.toString(id_utilisateur));
     //   labelCategorie.setBounds(15, 45, 200, 50);
     //   labelCategorie.setFont(new Font("Serif", Font.BOLD, 17));     //Définir le Font des labels.
    //    pRechercher_Prodiut.add(labelCategorie);
        
        JLabel labelCategorie2 = new JLabel("Categorie : ");  
        labelCategorie2.setBounds(15, 35, 200, 50);
        labelCategorie2.setFont(new Font("Serif", Font.BOLD, 17));     //Définir le Font des labels.
        pRechercher_Prodiut.add(labelCategorie2);
        
        JLabel labelSousCategorie = new JLabel("Sous Categorie : ");  
        labelSousCategorie.setBounds(15, 75, 200, 50);
        labelSousCategorie.setFont(new Font("Serif", Font.BOLD, 17));     //Définir le Font des labels.
        pRechercher_Prodiut.add(labelSousCategorie);
        
        JLabel labelRegion = new JLabel("Région : ");       //créer les Labels.
        labelRegion.setBounds(15, 115, 200, 50);
        labelRegion.setFont(new Font("Serif", Font.BOLD, 17));     //Définir le Font des labels.
        pRechercher_Prodiut.add(labelRegion);
        
        JComboBox<String> comboCategorie = new JComboBox<String>();
        comboCategorie.setFont(new Font("SansSerif", Font.PLAIN, 17));
        pRechercher_Prodiut.add(comboCategorie);
        comboCategorie.setBounds(163, 50, 353, 30);
        
        JComboBox<String> comboSousCategorie = new JComboBox<String>();
        comboSousCategorie.setFont(new Font("SansSerif", Font.PLAIN, 17));
        pRechercher_Prodiut.add(comboSousCategorie);
        comboSousCategorie.setBounds(163, 90, 353, 30);
        
        JComboBox<String> comboRegion = new JComboBox<String>();
        comboRegion.setFont(new Font("SansSerif", Font.PLAIN, 17));
        pRechercher_Prodiut.add(comboRegion);
        comboRegion.setBounds(163, 130, 353, 30);


      //  JList listCategorie = new JList(modelCategorie);         //Créer les Jlist.
     //   listCategorie.setFont(new Font("SansSerif", Font.PLAIN, 20));//Définir le Font des Ã©lÃ©ments dans liste.
     //.add(listCategorie);                             //Ajouter les listes au JFram
     //   listCategorie.setBounds(180, 70, 350, 80);       //Définir les tailles et les places des listes.
     //   listCategorie.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);     //Définir le mode de sÃ©lection (la maniÃ¨re dont les Ã©lÃ©ments peuvent Ãªtre sÃ©lectionnÃ©s).

       

        //Définir le tableau
        String Donnees[][] = {
                {"Kathy1", "Kathy2", "Kathy3", "Kathy4", "Kathy5", "Kathy6"},
                {"John1", "John2", "John3", "John4", "John5", "John6"},
                {"Sue", "Black", "Knitting", "Sue", "Sue", "Sue6"},
                {"Jane", "White", "Speed reading", "Sue", "Sue", "Jane"},
                {"Joe", "Brown", "Pool", "Sue", "Sue", "Joe"}
        };

        String colonne[] = {"Titre",
                "Description",
                "Catégorie",
                "Région",
                "Date",
                "Statut"};
        JTable table = new JTable(Donnees, colonne);
        table.setBounds(  12, 290,870 ,650);
        JScrollPane sp = new JScrollPane(table);
        f.add(sp);
        f.add(table);


        JbSoumettre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


            }

        });


        JbMesOffre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f1 = new JFrame();
                f1.setTitle("");

                String Data[][] = {
                        {"Kathy1", "Kathy2", "Kathy3", "Kathy4"},
                        {"John1", "John2", "John3", "John4"},
                        {"Sue", "Black", "Knitting", "Sue"},
                        {"Jane", "White", "Speed reading", "Sue",},
                        {"Joe", "Brown", "Pool", "Sue"}
                };

                String colonne[] = {"Titre",
                        "Annonceur",
                        "Date",
                        "mon_prix"};
                JTable jt = new JTable(Data, colonne);
                jt.setBounds(600, 700, 800, 700);
                JScrollPane sp = new JScrollPane(jt);
                f1.add(sp);
                f1.setSize(800, 300);
                f1.setLocationRelativeTo(null);
                f1.setVisible(true);


            }

        });

        JbHistoriqueVente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f2 = new JFrame();
                f2.setTitle("");

                String Data[][] = {
                        {"Kathy1", "Kathy2", "Kathy3", "Kathy4"},
                        {"John1", "John2", "John3", "John4"},
                        {"Sue", "Black", "Knitting", "Sue"},
                        {"Jane", "White", "Speed reading", "Sue",},
                        {"Joe", "Brown", "Pool", "Sue"}
                };

                String colonne[] = {"Achat",
                        "Date",
                        "Prix",
                        "Annonceur"};
                JTable jt = new JTable(Data, colonne);
                jt.setBounds (  15, 500, 770 , 700);
                JScrollPane sp = new JScrollPane(jt);
                f2.add(sp);
                f2.setSize(800, 770);
                f2.setLocationRelativeTo(null);
                f2.setVisible(true);


            }

        });

    }

}
