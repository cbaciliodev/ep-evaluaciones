export class Usuario {
    public constructor(
        public nombre?: string,
        public correo?: string,
        public password?: string,
        public role?: string,
        public avatar?: string,
        public _id?: string
    ) { }
}
