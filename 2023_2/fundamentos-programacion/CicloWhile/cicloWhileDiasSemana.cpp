#include <iostream>
using namespace std;

int main() {
    int diaInicial = 1;

    while (diaInicial<=20) {
        
        switch(diaInicial) {
            case 1:
                cout << diaInicial << " Lunes\n";
                break;
            
            case 2:
                cout << diaInicial << " Martes\n";
                break;

            case 3:
                cout << diaInicial << " Miércoles\n";
                break;
            
            case 4:
                cout << diaInicial << " Jueves\n";
                break;

            case 5:
                cout << diaInicial << " Viernes\n";
                break;

            case 6:
                cout << diaInicial << " Sábado\n";
                break;

            case 7:
                cout << diaInicial << " Domingo\n";
                break;
            
            default:
                cout << diaInicial << " Día no válido\n";
                break;

        }

        diaInicial++;
    }
    
    return 0;
    
}
