TYPE=VIEW
query=select `bdclick`.`conayudadiagnostica2`.`historia` AS `historia`,count(`bdclick`.`conayudadiagnostica2`.`historia`) AS `cantidadAyuda` from `bdclick`.`conayudadiagnostica2` group by `bdclick`.`conayudadiagnostica2`.`historia`
md5=4dff7c22b6ea263fd53d8b96a3e25368
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:21
create-version=2
source=select `conayudadiagnostica2`.`historia` AS `historia`,count(`conayudadiagnostica2`.`historia`) AS `cantidadAyuda` from `conayudadiagnostica2` group by `conayudadiagnostica2`.`historia`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`conayudadiagnostica2`.`historia` AS `historia`,count(`bdclick`.`conayudadiagnostica2`.`historia`) AS `cantidadAyuda` from `bdclick`.`conayudadiagnostica2` group by `bdclick`.`conayudadiagnostica2`.`historia`
mariadb-version=100135
