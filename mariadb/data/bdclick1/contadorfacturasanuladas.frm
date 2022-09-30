TYPE=VIEW
query=select count(`bdclick1`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick1`.`bdfactura`.`anulada` AS `anulada`,`bdclick1`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick1`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick1`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick1`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick1`.`bdfactura` group by `bdclick1`.`bdfactura`.`anulada`,`bdclick1`.`bdfactura`.`fechaAnulacion`,`bdclick1`.`bdfactura`.`cuadreAnulacion`,`bdclick1`.`bdfactura`.`usuarioAnula` having ((`bdclick1`.`bdfactura`.`anulada` = 1) and (`bdclick1`.`bdfactura`.`cuadreAnulacion` = \'\'))
md5=9a46c88b8c174b8a083be381fcc88ce8
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:33
create-version=2
source=select count(`bdfactura`.`anulada`) AS `contAnuladas`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdfactura` group by `bdfactura`.`anulada`,`bdfactura`.`fechaAnulacion`,`bdfactura`.`cuadreAnulacion`,`bdfactura`.`usuarioAnula` having ((`bdfactura`.`anulada` = 1) and (`bdfactura`.`cuadreAnulacion` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select count(`bdclick1`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick1`.`bdfactura`.`anulada` AS `anulada`,`bdclick1`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick1`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick1`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick1`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick1`.`bdfactura` group by `bdclick1`.`bdfactura`.`anulada`,`bdclick1`.`bdfactura`.`fechaAnulacion`,`bdclick1`.`bdfactura`.`cuadreAnulacion`,`bdclick1`.`bdfactura`.`usuarioAnula` having ((`bdclick1`.`bdfactura`.`anulada` = 1) and (`bdclick1`.`bdfactura`.`cuadreAnulacion` = \'\'))
mariadb-version=100135
