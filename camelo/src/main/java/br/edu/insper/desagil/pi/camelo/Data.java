package br.edu.insper.desagil.pi.camelo;

public class Data {
    private int maximoDias(int mes, int ano) {
        switch (mes) {
            case 1: // janeiro
            case 3: // março
            case 5: // maio
            case 7: // julho
            case 8: // agosto
            case 10: // outubro
            case 12: // dezembro
                return 31;
            case 4: // abril
            case 6: // junho
            case 9: // setembro
            case 11: // novembro
                return 30;
        }
        // fevereiro
        if (bissexto(ano)) {
            return 29;
        }
        return 28;
    }
}
