$(document).ready(function(){
 $("#btn_Enviaru").click(function(){//El evento
 let elUsuario =
document.getElementById("usuario").value;//cada control de la pagina tiene un Id
 let laClave =
document.getElementById("password").value;
 //esta varialbe contine el valor del campo cedula
$.post("http://localhost:8080/loginusuario2",{
usuario: elUsuario, password: laClave },
function(data, status){
// data1 = $.parseJSON( data );
if(data.existe==true)
{
alert("Bienvenido "+elUsuario);
window.location.href =
"user.jsp";
}
else
{
alert("No xiste el Usuario");
}
 });
 });
 function mostrarUno(item, index) {
 let valores = Object.values(item);

$("#usuario").val(valores[0]);
$("#password").val(valores[1]);
}
});