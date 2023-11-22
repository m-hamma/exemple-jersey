import {IUtilisateur} from "./utilisateur.interface";
export class Utilisateur implements IUtilisateur {
    nom: string="";
    age: number=0;

    constructor(data?: IUtilisateur) {
        if (data) {
            for (var property in data) {
                if (data.hasOwnProperty(property))
                    (<any>this)[property] = (<any>data)[property];
            }
        }
    }
    init(data?: any) {
            if (data) {
                this.nom = data["nom"];
                this.age = data["age"];
            }
        }
//  static fromJS(data: any): IUtilisateur {
//         let result = new Utilisateur();
//         result.init(data);
//         return result;
//     }

    toJSON(data?: any) {
        data = typeof data === 'object' ? data : {};
        data["nom"] = this.nom;
        data["age"] = this.age;
        return data;
    }

    clone() {
        const json = this.toJSON();
        let result = new Utilisateur();
        result.init(json);
        return result;
    }
}
