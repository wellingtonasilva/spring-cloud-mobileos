import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthComponent } from './auth.component';
import { LoginComponent } from './login/login.component';
import { RecoveryComponent } from './recovery/recovery.component';
import { RegisterComponent } from './register/register.component';



const routes: Routes = [{
  path: 'auth',
  component: AuthComponent,
  children: [
    { path: 'login', component: LoginComponent },
    { path: 'logout', component: LoginComponent },
    { path: 'recovery', component: RecoveryComponent },
    { path: 'register', component: RegisterComponent },
]
}];

@NgModule({
  imports: [RouterModule.forChild(routes)]
})
export class AuthRoutingModule {
}
