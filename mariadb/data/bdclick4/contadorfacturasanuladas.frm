TYPE=VIEW
query=select count(`bdclick4`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick4`.`bdfactura`.`anulada` AS `anulada`,`bdclick4`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick4`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick4`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick4`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick4`.`bdfactura` group by `bdclick4`.`bdfactura`.`anulada`,`bdclick4`.`bdfactura`.`fechaAnulacion`,`bdclick4`.`bdfactura`.`cuadreAnulacion`,`bdclick4`.`bdfactura`.`usuarioAnula` having ((`bdclick4`.`bdfactura`.`anulada` = 1) and (`bdclick4`.`bdfactura`.`cuadreAnulacion` = \'\'))
md5=4ab614e0bfd0ecb3040915eefb40bc03
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:26
create-version=2
source=select count(`bdfactura`.`anulada`) AS `contAnuladas`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdfactura` group by `bdfactura`.`anulada`,`bdfactura`.`fechaAnulacion`,`bdfactura`.`cuadreAnulacion`,`bdfactura`.`usuarioAnula` having ((`bdfactura`.`anulada` = 1) and (`bdfactura`.`cuadreAnulacion` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select count(`bdclick4`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick4`.`bdfactura`.`anulada` AS `anulada`,`bdclick4`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick4`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick4`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick4`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick4`.`bdfactura` group by `bdclick4`.`bdfactura`.`anulada`,`bdclick4`.`bdfactura`.`fechaAnulacion`,`bdclick4`.`bdfactura`.`cuadreAnulacion`,`bdclick4`.`bdfactura`.`usuarioAnula` having ((`bdclick4`.`bdfactura`.`anulada` = 1) and (`bdclick4`.`bdfactura`.`cuadreAnulacion` = \'\'))
mariadb-version=100135
