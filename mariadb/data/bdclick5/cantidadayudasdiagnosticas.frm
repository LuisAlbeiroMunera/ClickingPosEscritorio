TYPE=VIEW
query=select `bdclick5`.`conayudadiagnostica2`.`historia` AS `historia`,count(`bdclick5`.`conayudadiagnostica2`.`historia`) AS `cantidadAyuda` from `bdclick5`.`conayudadiagnostica2` group by `bdclick5`.`conayudadiagnostica2`.`historia`
md5=80791782f0864590ef93a429e39faf2e
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:44
create-version=2
source=select `conayudadiagnostica2`.`historia` AS `historia`,count(`conayudadiagnostica2`.`historia`) AS `cantidadAyuda` from `conayudadiagnostica2` group by `conayudadiagnostica2`.`historia`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`conayudadiagnostica2`.`historia` AS `historia`,count(`bdclick5`.`conayudadiagnostica2`.`historia`) AS `cantidadAyuda` from `bdclick5`.`conayudadiagnostica2` group by `bdclick5`.`conayudadiagnostica2`.`historia`
mariadb-version=100135