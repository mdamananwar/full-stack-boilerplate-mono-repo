import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-form',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './user-form.component.html',
  styleUrl: './user-form.component.css'
})
export class UserFormComponent {
  userName = '';
  phoneNumber: number | null = null;
  constructor(private userService: UserService){

  }
  saveUser() {

    const user = {
      username: this.userName,
      phoneNo: this.phoneNumber!
    };

    this.userService.saveUser(user).subscribe({
      next: (response) => {
        console.log('User saved:', response);
      },
      error: (error) => {
        console.error('Error saving user:', error);
      }
    });
  }
}
