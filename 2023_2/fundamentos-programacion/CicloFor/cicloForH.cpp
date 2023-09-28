#include <iostream>
using namespace std;

int main() {
    
    int altura = 20; // Altura de la letra "H"
    int anchura = 16; // Ancho de la letra "H"

    for (int i = 0; i <= altura; i++) {
        for (int j = 0; j <= anchura; j++) {
            
			if (j == 0 || j == anchura) {
				cout << "H";
			} else if (i == (altura / 2)){
				cout << "H";
			} else {
				cout << " ";
			}
			
        }
        // Salto de línea al final de cada fila
        cout << "\n";
    }

    return 0;
    
}
