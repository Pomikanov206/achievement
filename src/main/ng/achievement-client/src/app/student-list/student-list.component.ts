import { Component, OnInit } from '@angular/core';
import { StudentService } from "../student.service";
import { StudentInfo } from "../student-info";

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css'],
  providers: [StudentService]
})
export class StudentListComponent implements OnInit {
  selectedValue: string = "";
  studentsInfo: StudentInfo[] = [];

  group_list: string[] = [ "ks1", "ks2"];

  constructor(private studentService: StudentService) { }

  ngOnInit(): void {
    this.studentsInfo = this.studentService.getStudentList();
  }

}
