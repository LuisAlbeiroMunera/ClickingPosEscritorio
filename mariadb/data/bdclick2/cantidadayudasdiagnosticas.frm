TYPE=VIEW
query=select `bdclick2`.`conayudadiagnostica2`.`historia` AS `historia`,count(`bdclick2`.`conayudadiagnostica2`.`historia`) AS `cantidadAyuda` from `bdclick2`.`conayudadiagnostica2` group by `bdclick2`.`conayudadiagnostica2`.`historia`
md5=15c9f070e4aed45a3d4c99b39b631c17
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:42
create-version=2
source=select `conayudadiagnostica2`.`historia` AS `historia`,count(`conayudadiagnostica2`.`historia`) AS `cantidadAyuda` from `conayudadiagnostica2` group by `conayudadiagnostica2`.`historia`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`conayudadiagnostica2`.`historia` AS `historia`,count(`bdclick2`.`conayudadiagnostica2`.`historia`) AS `cantidadAyuda` from `bdclick2`.`conayudadiagnostica2` group by `bdclick2`.`conayudadiagnostica2`.`historia`
mariadb-version=100135
