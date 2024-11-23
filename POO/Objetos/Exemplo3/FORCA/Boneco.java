package POO.Objetos.Exemplo3.FORCA;

public class Boneco {
    String[][] boneco = new String[5][5];

    public Boneco(){
        boneco[0][0] = " ";  boneco[0][1] = "_"; boneco[0][2] = "_";  boneco[0][3] = "_"; boneco[0][4] = "_";
        boneco[1][0] = " ";  boneco[1][1] = "|"; boneco[1][2] = " ";  boneco[1][3] = " "; boneco[1][4] = "|";
        boneco[2][0] = " ";  boneco[2][1] = "O"; boneco[2][2] = " ";  boneco[2][3] = " "; boneco[2][4] = "|";
        boneco[3][0] = "/";  boneco[3][1] = "|"; boneco[3][2] = "\\"; boneco[3][3] = " "; boneco[3][4] = "|";
        boneco[4][0] = "/";  boneco[4][1] = " "; boneco[4][2] = "\\"; boneco[4][3] = " "; boneco[4][4] = "|";
    }

    public String getBoneco(int linha, int coluna){
        return this.boneco[linha][coluna];
    }

    public void perderMembro( int linha, int coluna){
        this.boneco[linha][coluna] = " ";
    }

    public String aparecer(){
        return  this.getBoneco(0,0) + this.getBoneco(0,1) + this.getBoneco(0,2) + this.getBoneco(0,3) + this.getBoneco(0,4) + '\n' +
                this.getBoneco(1,0) + this.getBoneco(1,1) + this.getBoneco(1,2) + this.getBoneco(1,3) + this.getBoneco(1,4) + '\n' +
                this.getBoneco(2,0) + this.getBoneco(2,1) + this.getBoneco(2,2) + this.getBoneco(2,3) + this.getBoneco(2,4) + '\n' +
                this.getBoneco(3,0) + this.getBoneco(3,1) + this.getBoneco(3,2) + this.getBoneco(3,3) + this.getBoneco(3,4) + '\n' +
                this.getBoneco(4,0) + this.getBoneco(4,1) + this.getBoneco(4,2) + this.getBoneco(4,3) + this.getBoneco(4,4);
    }

    
}