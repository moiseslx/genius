package com.application.genius.model;
/*
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
*/
public class Firebase {
    /*
        private static DatabaseReference referenciaFirebase;
        private static FirebaseAuth referenciaAutenticacao;
        private static StorageReference referenciaStorage;

        public static String getIdUsuario() {
            FirebaseAuth autenticacao = getFirebaseAutenticacao();
            return autenticacao.getCurrentUser().getUid();
        }

        //retorna a referencia do database
        public static DatabaseReference getFirebase() {
            if (referenciaFirebase == null) {
//Permite salvar local e sincornizar
                FirebaseDatabase.getInstance().setPersistenceEnabled(true);
//Obtem o nó raiz do Firebase
                referenciaFirebase = FirebaseDatabase.getInstance().getReference();
            }
            return referenciaFirebase;
        }

        //retorna a instancia do FirebaseAuth
        public static FirebaseAuth getFirebaseAutenticacao() {
            if (referenciaAutenticacao == null) {
                referenciaAutenticacao = FirebaseAuth.getInstance();
            }
            return referenciaAutenticacao;
        }

        //Retorna instancia do FirebaseStorage
        public static StorageReference getFirebaseStorage() {
            if (referenciaStorage == null) {
                referenciaStorage = FirebaseStorage.getInstance().getReference();
            }
            return referenciaStorage;
        }*/
}
