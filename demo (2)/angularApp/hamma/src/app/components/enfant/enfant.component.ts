import { Component, Input, OnInit, OnChanges, SimpleChanges } from "@angular/core";
import {Utilisateur} from "../dto/utilisateur";
@Component({
  selector: "app-enfant",
  templateUrl: "./enfant.component.html",
  styleUrls: ["./enfant.component.scss"]
})
export class EnfantComponent implements OnInit {

  @Input() utilisateur : Utilisateur;
  constructor() {

    this.utilisateur= new  Utilisateur({nom:"",age:0});
     // Called first time before the ngOnInit()
  }

  ngOnInit() {
  //this.utilisateur= new  Utilisateur({nom:"",age:0});
     // Called after the constructor and called  after the first ngOnChanges()
  }
//   ngOnChanges(changes: SimpleChanges) {
//           if (changes.Utilisateur) {
//               console.log("Changement détecté :", changes.utilisateur);
//               // Tu peux effectuer des opérations supplémentaires en réponse aux changements ici.
//           }
//       }

}
