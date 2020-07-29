import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/User';

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {
  get:any;
  constructor(private httpClient:HttpClient) { }

  getUsers(){
    return this.httpClient.get<User[]>('http://localhost:8080/user/get');
  }

  addUser(newUser:User){
    return this.httpClient.post<User>('http://localhost:8080/user/add',newUser);
  }

  deleteUser(id){
    return this.httpClient.delete<User>('http://localhost:8080/user/'+id);
  }
}
