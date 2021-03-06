import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {SubjectSoftwareModel} from '../model/subjectSoftware.model';
import {SecurityService} from '../service/security.service';
import {UserService} from '../service/user.service';
import {AbstractControl, FormBuilder, FormGroup, Validators} from '@angular/forms';
import {AllSubjectSoftwareModel} from '../model/allSubjectSoftware.model';

@Component ({
  selector: 'app-home',
  templateUrl: './software.component.html',
  styleUrls: ['/software.component.css']


})

export class SoftwareComponent implements  OnInit {

  public city: AbstractControl;
  subjects: AllSubjectSoftwareModel[];
  /*subjects: SubjectSoftwareModel[];*/
  public user: any;
  public form: FormGroup;


  constructor(protected router: Router, private data: SecurityService,
              private serviceUser: UserService, private fb: FormBuilder) {

    this.form = this.fb.group({

      'city': ['', Validators.compose([Validators.required])],

    });

    this.city = this.form.controls['city'];

  }

  ngOnInit() {

    this.user = this.serviceUser.getLoggedUser();

    this.data.getAllSubjectSoftwares(this.user.email).subscribe(data => this.subjects = data);
  }

  communicate(): any {

    this.data.checkCommunication(localStorage.getItem('loggedUser'), this.city.value).subscribe(res => {
        if (res == 0) {
          alert("Omogucena komunikacija");
        } else if (res == 1) {
          alert("Uspesno ste omogucili komunikaciju");
        } else if (res == 2) {
          alert("Nije moguce ostvariti komunikaciju");
        }
      });
  }


  back() {
    this.router.navigateByUrl('/home');
  }
}

