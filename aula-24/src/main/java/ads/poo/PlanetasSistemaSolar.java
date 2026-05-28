package ads.poo;

public enum PlanetasSistemaSolar {

    MERCURIO(1, "mercúrio"),
    VENUS(2,"vênus"),
    TERRA(3,"terra"),
    MARTE(4,"marte"),
    JUPITER(5,"júpiter"),
    SATURNO(6,"saturno"),
    URANO(7,"urano"),
    NETUNO(8,"netuno");

    public final int posicao;
    public final String extenso;

    PlanetasSistemaSolar(int posicao, String extenso) {
        this.posicao = posicao;
        this.extenso = extenso;
    }

    public static PlanetasSistemaSolar getByPosicao(int posicao){
        for (PlanetasSistemaSolar p : PlanetasSistemaSolar.values()){
            if(p.posicao == posicao){
                return p;
            }
        }
        throw new IllegalArgumentException("posição inválida");
    }

    @Override
    public String toString() {
        return  extenso;
    }
}
