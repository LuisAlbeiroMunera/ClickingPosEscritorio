TYPE=VIEW
query=(select sum(`bdclick5`.`bdfactura`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`bdclick5`.`bdfactura`.`totalGeneral`) AS `totalAnulacionCuadre`,`bdclick5`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,count(`bdclick5`.`bdfactura`.`cuadreAnulacion`) AS `contAnuladas` from `bdclick5`.`bdfactura` group by `bdclick5`.`bdfactura`.`cuadreAnulacion`)
md5=d023ab301eeeb7248566f708b95eb396
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:51
create-version=2
source=(select sum(`bdfactura`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`bdfactura`.`totalGeneral`) AS `totalAnulacionCuadre`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,count(`bdfactura`.`cuadreAnulacion`) AS `contAnuladas` from `bdfactura` group by `bdfactura`.`cuadreAnulacion`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select sum(`bdclick5`.`bdfactura`.`subtotalGeneral`) AS `SumaDesubtotal`,sum(`bdclick5`.`bdfactura`.`totalGeneral`) AS `totalAnulacionCuadre`,`bdclick5`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,count(`bdclick5`.`bdfactura`.`cuadreAnulacion`) AS `contAnuladas` from `bdclick5`.`bdfactura` group by `bdclick5`.`bdfactura`.`cuadreAnulacion`)
mariadb-version=100135