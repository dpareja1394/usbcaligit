import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Categoria } from '../model/categoria';
import { Observable } from 'rxjs';
import { environment } from 'src/app/environments/environment';

@Injectable({
    providedIn: 'root'
  })
export class CategoriaService {
    
    constructor(private httClient: HttpClient) { }
  
    obtenerCategorias(): Observable<Categoria[]>{
      return this.httClient.get<Categoria[]>(`${environment.urlBase}/categoria/buscarTodas`);
    }

    obtenerCategoriaId(idCategoria: number): Observable<Categoria>{
      return this.httClient.get<Categoria>(`${environment.urlBase}/categoria/buscarPorId/?id=${idCategoria}`);
    }

    crearCategoria(categoria: Categoria): Observable<Categoria>{
      return this.httClient.post<Categoria>(`${environment.urlBase}/categoria/nueva`,categoria);
    }

    actualizarCategoria(categoria: Categoria): Observable<Categoria>{
      return this.httClient.put<Categoria>(`${environment.urlBase}/categoria/actualizar`,categoria);
    }
  }