TYPE=VIEW
query=select count(`bdclick3`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick3`.`bdfactura`.`anulada` AS `anulada`,`bdclick3`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick3`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick3`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick3`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick3`.`bdfactura` group by `bdclick3`.`bdfactura`.`anulada`,`bdclick3`.`bdfactura`.`fechaAnulacion`,`bdclick3`.`bdfactura`.`cuadreAnulacion`,`bdclick3`.`bdfactura`.`usuarioAnula` having ((`bdclick3`.`bdfactura`.`anulada` = 1) and (`bdclick3`.`bdfactura`.`cuadreAnulacion` = \'\'))
md5=308b81b0f3d5713bcdc153ccd575fe10
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:49
create-version=2
source=select count(`bdfactura`.`anulada`) AS `contAnuladas`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdfactura` group by `bdfactura`.`anulada`,`bdfactura`.`fechaAnulacion`,`bdfactura`.`cuadreAnulacion`,`bdfactura`.`usuarioAnula` having ((`bdfactura`.`anulada` = 1) and (`bdfactura`.`cuadreAnulacion` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select count(`bdclick3`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick3`.`bdfactura`.`anulada` AS `anulada`,`bdclick3`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick3`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick3`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick3`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick3`.`bdfactura` group by `bdclick3`.`bdfactura`.`anulada`,`bdclick3`.`bdfactura`.`fechaAnulacion`,`bdclick3`.`bdfactura`.`cuadreAnulacion`,`bdclick3`.`bdfactura`.`usuarioAnula` having ((`bdclick3`.`bdfactura`.`anulada` = 1) and (`bdclick3`.`bdfactura`.`cuadreAnulacion` = \'\'))
mariadb-version=100135
