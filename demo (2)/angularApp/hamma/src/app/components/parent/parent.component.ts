import { Component, OnInit } from "@angular/core";
import {Utilisateur} from "../dto/utilisateur";

@Component({
  selector: "app-parent",
  templateUrl: "./parent.component.html",
  styleUrls: ["./parent.component.scss"]
})
export class ParentComponent implements OnInit {
   parentUtilisateur:Utilisateur;
   constructor() {
      this.parentUtilisateur=new Utilisateur({nom: "Alexis", age: 30 });
   }
 ngOnInit() {
  }
}
