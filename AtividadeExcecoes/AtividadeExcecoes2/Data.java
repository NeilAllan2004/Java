public class Data {
    
    public Data(int Dia, int Mes, int Ano){
        try{
            ConferirData(Dia, Mes, Ano);
        }catch(DataException e){
            System.out.println(e);
        }
    }
    public static void ConferirData(int Dia, int Mes, int Ano) throws DataException{
        if (Mes>12 || Mes<=0 || Dia<=0 || Dia>31 || Ano<=0){
            throw new DataException();
        }
        
        else if(Mes==2 && Dia>28){
            throw new DataException();
        }
        else if (Dia>30 && Mes!=2 && ((Mes%2==0 && Mes<=6) || (Mes%2!=0 && Mes>8))){
            throw new DataException();
        }
        else{
            System.out.println("A data "+Dia+"/"+Mes+"/"+Ano+" é válida");
        }
    }
    
}
