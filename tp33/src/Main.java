public class Main {
    public static void main(String[] args) {
        Adresse adresslab = new Adresse();
        adresslab.codePostale=178;
        adresslab.ville="monastir";
        adresslab.gouvernorat="bennane";
        adresslab.afficherAdress();
        adresslab.codePostale=5025;
        adresslab.afficherAdress();
        Adresse autreadresslab = new Adresse("jemmel","tunis",5020);
        autreadresslab.ville="monastir";
        autreadresslab.afficherAdress();
        Chercheur chercheur = new Chercheur("ilyes","data_Analist",20);
        Chercheur autrechercheur = new Chercheur();
        autrechercheur.numOrdinateur=2;
        autrechercheur.nomChercheur="ilyes";
        autrechercheur.postChercheur="Developeur";
        autrechercheur.afficherChercheur();
        System.out.println("le nombre de chercheurs cree est: "+ autrechercheur.getChercheur());
        System.out.println("est il chercheur1 == chercheur2 ? "+autrechercheur.comparer(chercheur));
        chercheur.numOrdinateur=19;
        Chercheur chercheur3 = new Chercheur();
        chercheur3.numOrdinateur=14;
        chercheur3.postChercheur="web-developer";
        chercheur3.nomChercheur="houssem";
        Bureau bureau1=new Bureau();
        Bureau bureau2=new Bureau();
        Laboratoire laboratoire1= new Laboratoire();

        laboratoire1.afficherLaboratoire();



    }
}