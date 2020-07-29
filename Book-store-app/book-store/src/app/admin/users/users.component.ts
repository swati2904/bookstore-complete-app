import { Component, OnInit } from '@angular/core';
import { User } from '../../model/User';
import { Router, ActivatedRoute } from '@angular/router';
import { HttpClientService } from '../../service/http-client.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  // creating an array 
  users: Array<User>;
  action: string;
  selectedUser: User;
  
  constructor(private httpClientService: HttpClientService, private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {

    this.httpClientService.getUsers().subscribe(Response => this.handleSuccessfulResponse(Response),);

    this.activatedRoute.queryParams.subscribe((params) => {this.action = params['action']})
  }

  handleSuccessfulResponse(response){
    this.users = response;
  }

  adduser(){
    this.selectedUser = new User();
    this.router.navigate(['admin','users'],{queryParams: {action: 'add'}});
  }
}
