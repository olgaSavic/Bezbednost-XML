
import {Component} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {AbstractControl, FormBuilder, FormGroup, Validators} from '@angular/forms';
import {UserModel} from '../model/user.model';
import {UserService} from '../service/user.service';


@Component ({
  templateUrl: './registration.component.html',
})

export class RegistrationComponent {

  public form: FormGroup;
  public username: AbstractControl;
  public password: AbstractControl;
  public rePassword: AbstractControl;
  public firstName: AbstractControl;
  public lastName: AbstractControl;
  public email: AbstractControl;
  public city: AbstractControl;
  public us: UserModel = new UserModel();

  constructor(protected router: Router,
              private fb: FormBuilder,
              private userService: UserService,
              private route: ActivatedRoute) {

    this.form = this.fb.group({
      'username': ['', Validators.compose([Validators.required, Validators.pattern('[A-Za-z0-9]+$')])],
      'password': ['', Validators.compose([Validators.required])],
      'rePassword': ['', Validators.compose([Validators.required])],
      'firstName': ['', Validators.compose([Validators.required, Validators.pattern('[A-Za-z]+$')])],
      'lastName': ['', Validators.compose([Validators.required, Validators.pattern('[A-Za-z]+$')])],
      'email': ['', Validators.compose([Validators.required, Validators.pattern('^[a-zA-Z0-9.!#$%&\'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*.com$')])]
    });

    this.username = this.form.controls['username'];
    this.password = this.form.controls['password'];
    this.rePassword = this.form.controls['rePassword'];
    this.firstName = this.form.controls['firstName'];
    this.lastName = this.form.controls['lastName'];
    this.email = this.form.controls['email'];

  }

  validateRegData() {

    let error = false;
    let errorMessage = '';
    let errorMail = false;

    /* PROVERA LOZINKE */
    if (this.password.value.length < 8) {
      error = true;
      errorMessage = 'Lozinka mora biti barem 8 karaktera dugačka!';
      return errorMessage;
      /*alert('Password needs to be at least 8 characters long');*/
    } else if (/\d/.test(this.password.value) == false) {
      error = true;
      errorMessage = 'Lozinka mora sadržati barem jedan broj!';
      return errorMessage;
      /*alert('Password needs to contain at least one number!');*/
    } else if (!this.password.value.match('.*[A-Z].*')) {
      error = true;
      errorMessage = 'Lozinka mora posedovati barem jedno veliko slovo!';
      return errorMessage;
      /*alert('Password needs to contain at lease one uppercase letter!');*/
    }

    /* PROVERA POKLAPANJA LOZINKI */
    if (this.password.value !== this.rePassword.value) {
      error = true;
      errorMessage = 'Lozinke se ne poklapaju!';
      return errorMessage;
    }

    /* PROVERA MEJLA */
    const patternMail = /\b[\w\.-]+@[\w\.-]+\.\w{2,4}\b/;
    if (!patternMail.test(this.email.value)) {
      error = true;
      errorMessage = 'Email adresa sadrzi nedozvoljene karaktere!';
      return errorMessage;
    }

    return 'Ok';

  }

  escapeCharacters(value: string): string{
    return value
      .replace(/&/g, '&amp;')
      .replace(/</g, '&lt;')
      .replace(/>/g, '&gt;')
      .replace(/\"/g, '&quot;')
      .replace(/\//g, '&#x2F;')
      .replace('src', 'drc')
      .replace(/\'/g, '&apos')

  }

  signUp() {

      let message = this.validateRegData();

      if (message == "Ok") {

        this.us.firstName = this.escapeCharacters(this.firstName.value);
        this.us.username = this.escapeCharacters(this.username.value);
        this.us.lastName = this.escapeCharacters(this.lastName.value);
        this.us.password = this.password.value;
        this.us.rePassword = this.rePassword.value;
        this.us.email = this.escapeCharacters(this.email.value);

        this.userService.registration(this.us).subscribe(data => {
          this.router.navigateByUrl('');
        });
      } else {
      alert(message);
    }

  }

  exit() {
    this.router.navigateByUrl('');
  }
}
