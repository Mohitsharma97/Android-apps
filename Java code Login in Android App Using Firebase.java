

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      
        mAuth =FirebaseAuth.getInstance();
    
        mLoginButton = (Button) findViewById(R.id.loginButton);


      
       

         mLoginButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
           
                 String email = mLoginEmailField.getText().toString();
                 String password = mLoginPassword.getText().toString();
                 if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password))
                 {
                   
                     mProgress.show();

                     mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                         @Override
                         public void onComplete(@NonNull Task<AuthResult> task) {
                             if(task.isSuccessful()){
                                 sendtomain();
                             }else{
                                 String errormessage = task.getException().getMessage();
                                 Toast.makeText(LoginActivity.this,"Error : " +errormessage,Toast.LENGTH_LONG).show();
                             }
                        
                             mProgress.dismiss();
                         }
                     });
                 }
             }
         });














    }
}


