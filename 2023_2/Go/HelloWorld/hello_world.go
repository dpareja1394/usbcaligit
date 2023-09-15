package main

import (
	"container/list"
	"fmt"
	"reflect"
)

func main() {
	// Comentario

	/*
		Más comentarios
	*/

	fmt.Println("Hola, Go!")

	// Variables
	// var name type
	var myString string = "Esto es una cadena de texto"
	fmt.Println(myString)

	myString = "Se cambia el valor de la cadena de texto"
	fmt.Println(myString)

	// Tipado fuerte, requiere el tipo de dato

	var myString2 string = "Otra cadena de texto"
	fmt.Println(myString2)

	var myInt int8 = 7
	myInt += 10
	fmt.Println(myInt)
	fmt.Println(myInt - 1)
	fmt.Println(myInt)

	// fmt.Printf("%s %d", myString, myInt)
	fmt.Println(myString, myInt)
	fmt.Println(reflect.TypeOf(myInt))

	var myFloat float32 = 2.5
	fmt.Println(myFloat)
	fmt.Println(reflect.TypeOf(myFloat))
	fmt.Println(myInt + int8(myFloat))
	fmt.Println(myFloat + float32(myInt))

	var myBool bool = false
	myBool = true
	fmt.Println(myBool)

	// var myString3 string = "Esto es una cadena de texto"
	// Variable declarada e inicializada de manera abreviada
	myString3 := "Esto es una cadena de texto"
	fmt.Println(myString3)

	// Constantes
	const myConst = "Esto es una constante"
	fmt.Println(myConst)

	//myInt = 10
	myString = "Hola"

	if myInt == 10 && myString == "Hola" {
		fmt.Println("El valor es 10")
	} else if myInt == 11 || myString == "Hola" {
		fmt.Println("El valor es 11")
	} else {
		fmt.Println("El valor no es 10")
	}

	// Array
	var myArray [3]int
	myArray[0] = 1
	myArray[1] = 6
	myArray[2] = 2

	fmt.Println(myArray)
	fmt.Println(myArray[2])
	fmt.Println(myArray[1])
	fmt.Println(myArray[0])

	// Map Creación
	myMap := make(map[string]int)
	myMap["Daniel"] = 13
	myMap["Edilson"] = 15
	myMap["Blanca"] = 1
	myMap["Alejandro"] = 13

	fmt.Println(myMap)
	fmt.Println(myMap["Daniel"])

	// Creación e inicialización de Map
	anotherMap := map[string]int{"iPad": 1, "iPhone": 2, "appleWatch": 3}
	fmt.Println(anotherMap)

	// List
	myList := list.New()
	myList.PushBack(23)
	myList.PushBack(15)
	myList.PushBack(3)
	fmt.Println(myList.Back().Value)

	// Ciclos - Bucles
	for i := 0; i < len(myArray); i++ {
		fmt.Println(myArray[i])
	}

	for index, value := range myArray {
		fmt.Println(index, value)
	}

	for key, value := range myMap {
		fmt.Println(key, value)
	}

	myFunction()
	fmt.Println(myFunctionReturn())

	// Estructuras -> No hay clases sino estructuras
	type MyStruct struct {
		name string
		age  int
	}

	myStruct := MyStruct{"Daniel", 29}
	fmt.Println(myStruct)
}

func myFunction() {
	fmt.Println("Mi función")
}

func myFunctionReturn() string {
	return "Mi función con retorno"
}
