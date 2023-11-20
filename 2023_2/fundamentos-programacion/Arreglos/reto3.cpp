#include <iostream>
using namespace std;

void sumar(int a, int b)
{
    cout << a << " + " << b << " = " << (a + b) << endl;
}

void restar(int a, int b)
{
    cout << a << " - " << b << " = " << (a - b) << endl;
}

void multiplicar(int a, int b)
{
    cout << a << " x " << b << " = " << (a * b) << endl;
}

void dividir(int a, int b)
{
    cout << a << " / " << b << " = " << (a / b) << endl;
}

int main()
{
    int numeros[8][3] = {{2, 2, 1},
                         {3, 45, 3},
                         {12, 23, 2},
                         {11, 0, 2},
                         {19, 9, 4},
                         {20, 5, 4},
                         {78, 34, 2},
                         {96, 102, 2}};

    // Obtener el número de filas y columnas
    int filas = sizeof(numeros) / sizeof(numeros[0]);
    int columnas = sizeof(numeros[0]) / sizeof(numeros[0][0]);

    for (int i = 0; i < filas; i++)
    {
        int a, b, operacion;
        for (int j = 0; j < columnas; j++)
        {
            if (j == 0)
                a = numeros[i][j];
            if (j == 1)
                b = numeros[i][j];
            if (j == 2)
            {
                operacion = numeros[i][j];

                switch (operacion)
                {
                case 1:
                    sumar(a, b);
                    break;

                case 2:
                    restar(a, b);
                    break;

                case 3:
                    multiplicar(a, b);
                    break;

                case 4:
                    dividir(a, b);
                    break;

                default:
                    break;
                }
            }
        }
    }

    return 0;
}
