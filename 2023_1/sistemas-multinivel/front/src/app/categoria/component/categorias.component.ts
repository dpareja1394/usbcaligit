import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';

import { CategoriaService } from '../service/categoria.service';
import { Categoria } from '../model/categoria';

import { FormBuilder, FormGroup, FormControl, Validators} from '@angular/forms';
import Swal from 'sweetalert2';
import { SwalUtils } from 'src/app/shared/utils';

@Component({
  selector: 'app-categorias',
  templateUrl: './categorias.component.html',
  styleUrls: ['./categorias.component.scss']
})
export class CategoriasComponent {

  listColumnas: string[] = ['id','nombre','descripcion','opciones'];

  listCategorias: Categoria[] = [];

  dataSource: MatTableDataSource<Categoria> = new MatTableDataSource<Categoria>([]);

  form!: FormGroup;

  isForm!: Promise<any>;

  categoria: Categoria;

  constructor(private categoriaService: CategoriaService, private formBuilder: FormBuilder){
  }

  ngOnInit(): void {
    this.cargarDatos();
    this.iniciarFormulario();
  }

  private cargarDatos(): void {
    this.categoriaService.obtenerCategorias().subscribe(
      (resp: Categoria[]) => {
        this.listCategorias = resp;
        this.dataSource = new MatTableDataSource<Categoria>(resp);
      }
    );
  }

  iniciarFormulario(): void {
    this.isForm = Promise.resolve(
      (this.form = this.formBuilder.group({
        nombre: new FormControl(null, [Validators.required]),
        descripcion: new FormControl(null, [Validators.required])
      }))
    );
  }


  verDetalle(cat: Categoria): void {
    this.categoriaService.obtenerCategoriaId(cat.id).subscribe((resp:Categoria) => {
      console.log('categoria', resp);
    });
  }

  agregar(): void {
    if(this.form.invalid){
      SwalUtils.showAlert('Informacion','completar los campos requeridos','warning');
    }else{
      const values = this.form.value;
      let categoria: Categoria = {
        nombre: values.nombre,
        descripcion: values.descripcion
      };
      this.categoriaService.crearCategoria(categoria).subscribe(
        (resp: Categoria) => {
          SwalUtils.showAlert('Información','Registro creado exitosamente','success')
            .then(() => {
              this.cargarDatos();
            })
      }, (error: any) => {
          SwalUtils.showAlert('Error', error.error.errorMessage, 'error')
          //console.log('fallo por', error.error.errorMessage);
      });
    }
  }

  editarCategoria(categoria: Categoria): void {
    this.form.get('nombre').setValue(categoria.nombre);
    this.form.get('descripcion').setValue(categoria.descripcion);
    this.categoria = categoria;
  }

  procesarOperacion(): void {
    if(this.categoria && this.categoria.id){
      this.actualizarCategoria();
    }else{
      this.agregar();
    }
  }

  actualizarCategoria(): void {
    const values = this.form.value;
    let categoria: Categoria = {
      id: this.categoria.id,
      nombre: values.nombre,
      descripcion: values.descripcion
    };
    this.categoriaService.actualizarCategoria(categoria).subscribe(() => {
      SwalUtils.showAlert('Información','Registro actualizado exitosamente','success')
      .then(() => {
        this.cargarDatos();
      })
    }, (error: any) => {
      SwalUtils.showAlert('Error', error.error.errorMessage, 'error')
      //console.log('fallo por', error.error.errorMessage);
    });
  }







}
