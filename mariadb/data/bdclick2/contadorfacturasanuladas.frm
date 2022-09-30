TYPE=VIEW
query=select count(`bdclick2`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick2`.`bdfactura`.`anulada` AS `anulada`,`bdclick2`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick2`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick2`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick2`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick2`.`bdfactura` group by `bdclick2`.`bdfactura`.`anulada`,`bdclick2`.`bdfactura`.`fechaAnulacion`,`bdclick2`.`bdfactura`.`cuadreAnulacion`,`bdclick2`.`bdfactura`.`usuarioAnula` having ((`bdclick2`.`bdfactura`.`anulada` = 1) and (`bdclick2`.`bdfactura`.`cuadreAnulacion` = \'\'))
md5=8324b7b0300a16431b128de9dcc3f003
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=select count(`bdfactura`.`anulada`) AS `contAnuladas`,`bdfactura`.`anulada` AS `anulada`,`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdfactura` group by `bdfactura`.`anulada`,`bdfactura`.`fechaAnulacion`,`bdfactura`.`cuadreAnulacion`,`bdfactura`.`usuarioAnula` having ((`bdfactura`.`anulada` = 1) and (`bdfactura`.`cuadreAnulacion` = \'\'))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select count(`bdclick2`.`bdfactura`.`anulada`) AS `contAnuladas`,`bdclick2`.`bdfactura`.`anulada` AS `anulada`,`bdclick2`.`bdfactura`.`fechaAnulacion` AS `fechaAnulacion`,sum(`bdclick2`.`bdfactura`.`total`) AS `sumaTotalAnuladas`,`bdclick2`.`bdfactura`.`cuadreAnulacion` AS `cuadreAnulacion`,`bdclick2`.`bdfactura`.`usuarioAnula` AS `usuarioAnula` from `bdclick2`.`bdfactura` group by `bdclick2`.`bdfactura`.`anulada`,`bdclick2`.`bdfactura`.`fechaAnulacion`,`bdclick2`.`bdfactura`.`cuadreAnulacion`,`bdclick2`.`bdfactura`.`usuarioAnula` having ((`bdclick2`.`bdfactura`.`anulada` = 1) and (`bdclick2`.`bdfactura`.`cuadreAnulacion` = \'\'))
mariadb-version=100135
