TYPE=VIEW
query=select count(`bdclick6`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick6`.`bdfactura`.`anulada` AS `anulada`,`bdclick6`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick6`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick6`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick6`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick6`.`bdfactura` group by `bdclick6`.`bdfactura`.`anulada`,`bdclick6`.`bdfactura`.`fechaAnulacion`,`bdclick6`.`bdfactura`.`cuadreAnulacion`,`bdclick6`.`bdfactura`.`usuarioAnula` having ((`bdclick6`.`bdfactura`.`anulada` = 1) and (`bdclick6`.`bdfactura`.`cuadreAnulacion` = \'\'))
md5=2007d1e0cec827fcb9383e208bd0418d
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=select count(`bdfactura`.`anulada`) AS `contAnuladas`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdfactura` group by `bdfactura`.`anulada`,`bdfactura`.`fechaAnulacion`,`bdfactura`.`cuadreAnulacion`,`bdfactura`.`usuarioAnula` having ((`bdfactura`.`anulada` = 1) and (`bdfactura`.`cuadreAnulacion` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select count(`bdclick6`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick6`.`bdfactura`.`anulada` AS `anulada`,`bdclick6`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick6`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick6`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick6`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick6`.`bdfactura` group by `bdclick6`.`bdfactura`.`anulada`,`bdclick6`.`bdfactura`.`fechaAnulacion`,`bdclick6`.`bdfactura`.`cuadreAnulacion`,`bdclick6`.`bdfactura`.`usuarioAnula` having ((`bdclick6`.`bdfactura`.`anulada` = 1) and (`bdclick6`.`bdfactura`.`cuadreAnulacion` = \'\'))
mariadb-version=100135
