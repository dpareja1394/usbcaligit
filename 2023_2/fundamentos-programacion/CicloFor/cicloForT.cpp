#include <iostream>
using namespace std;

int main() {
    
    int altura = 20; // Altura de la letra "T"
    int anchura = 16; // Ancho de la letra "T"

    for (int i = 0; i <= altura; i++) {
        for (int j = 0; j <= anchura; j++) {
            
			if (i == 0) {
				cout << "T";
			} else if (j == (anchura / 2)){
				cout << "T";
			} else {
				cout << " ";
			}
			
        }
        // Salto de línea al final de cada fila
        cout << "\n";
    }

    return 0;
    
}
