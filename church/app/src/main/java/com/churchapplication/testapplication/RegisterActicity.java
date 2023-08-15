package com.churchapplication.testapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActicity extends AppCompatActivity {

    private FirebaseAuth mFirebaseAuth; // 파이어 베이스 인증처리
    private DatabaseReference mDatabaseRef; // 실시간 데이터 베이스
    private EditText mEtEmail, mEtpassward; //회원가입 입력 필드
    private Button mbtnRegister; // 회원가입 버튼


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_acticity);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mDatabaseRef = FirebaseDatabase.getInstance().getReference("Jinseok");

        mEtEmail = findViewById(R.id.et_email);
        mEtpassward = findViewById(R.id.et_password);
        mbtnRegister = findViewById(R.id.btn_register);

        mbtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //회원가입 처리
                String strEmail = mEtEmail.getText().toString();
                String strPwd = mEtpassward.getText().toString();

                //Firebase Auth 진행

                mFirebaseAuth.createUserWithEmailAndPassword(strEmail,strPwd).addOnCompleteListener(RegisterActicity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                     //회원가입이 성공했을때 이후 과정

                      if(task.isSuccessful()){
                          FirebaseUser firebaseUser = mFirebaseAuth.getCurrentUser();
                          UserAccount account = new UserAccount();
                          account.setIdToken(firebaseUser.getUid());
                          account.setEmailId(firebaseUser.getEmail());
                          account.setPassword(strPwd);

                          //setValue 는 데이터 베이스에 삽입하는 것임
                          mDatabaseRef.child("UserAccount").child(firebaseUser.getUid()).setValue(account);

                          Toast.makeText(RegisterActicity.this, "회원가입에 성공하셨습니다",Toast.LENGTH_SHORT).show();

                      }
                      else{
                          Toast.makeText(RegisterActicity.this, "회원가입에 실패하셨습니다",Toast.LENGTH_SHORT).show();
                      }
                    }
                });
            }
        });
    }
}