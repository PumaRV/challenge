import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FoodItemService {

  private baseUrl = '/foodItem';

  constructor(private http: HttpClient) { }

  getFoodItem(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }
}
