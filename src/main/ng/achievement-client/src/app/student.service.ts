import { Injectable } from '@angular/core';
import { StudentInfo} from "./student-info";

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  private studentList: StudentInfo[] =
  [
    { id:1, name:"Bobby", group:"ks-20-1"},
    { id:1, name:"Garry", group:"ks-20-1"},
    { id:1, name:"Sandy", group:"ks-21-1"},
    { id:1, name:"Jonh", group:"ks-21-1"},
    { id:1, name:"Bret", group:"ks-22-1"}
  ];

  constructor() { }
  
  getStudentList(){
    return this.studentList;
  }
    
  getStudent(id: number){
    return null;
  }
}
