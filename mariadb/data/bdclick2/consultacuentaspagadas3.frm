TYPE=VIEW
query=(select `consultacuentaspagadas`.`factura` AS `factura`,`consultacuentaspagadas`.`Descripcion` AS `Descripcion`,`consultacuentaspagadas`.`vendedor` AS `vendedor`,`consultacuentaspagadas`.`cliente` AS `cliente`,`consultacuentaspagadas`.`nombre` AS `nombre`,`consultacuentaspagadas`.`fechaFactura` AS `fechaFactura`,`consultacuentaspagadas`.`vencimiento` AS `vencimiento`,`consultacuentaspagadas`.`valorAprovado` AS `valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000) AS `interes2`,`consultacuentaspagadas`.`totalInteres` AS `totalInteres`,`consultacuentaspagadas`.`total` AS `total`,`consultacuentaspagadas`.`cuotas` AS `cuotas`,sum(`bdclick2`.`bdcuota`.`totalAbono`) AS `SumaDetotalAbono`,`bdclick2`.`contcuentas3`.`CuentaDetotal2` AS `CuentaDetotal2`,`bdclick2`.`contatrasadas3`.`CuentaDeestado` AS `CuentaDeestado` from (((`bdclick2`.`bdcuota` join `bdclick2`.`consultacuentaspagadas` on((`bdclick2`.`bdcuota`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `bdclick2`.`contcuentas3` on((`bdclick2`.`contcuentas3`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `bdclick2`.`contatrasadas3` on((`consultacuentaspagadas`.`factura` = `bdclick2`.`contatrasadas3`.`contrato`))) group by `consultacuentaspagadas`.`factura`,`consultacuentaspagadas`.`vendedor`,`consultacuentaspagadas`.`cliente`,`consultacuentaspagadas`.`nombre`,`consultacuentaspagadas`.`fechaFactura`,`consultacuentaspagadas`.`vencimiento`,`consultacuentaspagadas`.`valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000),`consultacuentaspagadas`.`totalInteres`,`consultacuentaspagadas`.`total`,`consultacuentaspagadas`.`cuotas`,`bdclick2`.`contcuentas3`.`CuentaDetotal2`,`bdclick2`.`contatrasadas3`.`CuentaDeestado`)
md5=de81c4257a14a78756f90a4e82839e83
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:44
create-version=2
source=(select `consultacuentaspagadas`.`factura` AS `factura`,`consultacuentaspagadas`.`Descripcion` AS `Descripcion`,`consultacuentaspagadas`.`vendedor` AS `vendedor`,`consultacuentaspagadas`.`cliente` AS `cliente`,`consultacuentaspagadas`.`nombre` AS `nombre`,`consultacuentaspagadas`.`fechaFactura` AS `fechaFactura`,`consultacuentaspagadas`.`vencimiento` AS `vencimiento`,`consultacuentaspagadas`.`valorAprovado` AS `valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000) AS `interes2`,`consultacuentaspagadas`.`totalInteres` AS `totalInteres`,`consultacuentaspagadas`.`total` AS `total`,`consultacuentaspagadas`.`cuotas` AS `cuotas`,sum(`bdcuota`.`totalAbono`) AS `SumaDetotalAbono`,`contcuentas3`.`CuentaDetotal2` AS `CuentaDetotal2`,`contatrasadas3`.`CuentaDeestado` AS `CuentaDeestado` from (((`bdcuota` join `consultacuentaspagadas` on((`bdcuota`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `contcuentas3` on((`contcuentas3`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `contatrasadas3` on((`consultacuentaspagadas`.`factura` = `contatrasadas3`.`contrato`))) group by `consultacuentaspagadas`.`factura`,`consultacuentaspagadas`.`vendedor`,`consultacuentaspagadas`.`cliente`,`consultacuentaspagadas`.`nombre`,`consultacuentaspagadas`.`fechaFactura`,`consultacuentaspagadas`.`vencimiento`,`consultacuentaspagadas`.`valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000),`consultacuentaspagadas`.`totalInteres`,`consultacuentaspagadas`.`total`,`consultacuentaspagadas`.`cuotas`,`contcuentas3`.`CuentaDetotal2`,`contatrasadas3`.`CuentaDeestado`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `consultacuentaspagadas`.`factura` AS `factura`,`consultacuentaspagadas`.`Descripcion` AS `Descripcion`,`consultacuentaspagadas`.`vendedor` AS `vendedor`,`consultacuentaspagadas`.`cliente` AS `cliente`,`consultacuentaspagadas`.`nombre` AS `nombre`,`consultacuentaspagadas`.`fechaFactura` AS `fechaFactura`,`consultacuentaspagadas`.`vencimiento` AS `vencimiento`,`consultacuentaspagadas`.`valorAprovado` AS `valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000) AS `interes2`,`consultacuentaspagadas`.`totalInteres` AS `totalInteres`,`consultacuentaspagadas`.`total` AS `total`,`consultacuentaspagadas`.`cuotas` AS `cuotas`,sum(`bdclick2`.`bdcuota`.`totalAbono`) AS `SumaDetotalAbono`,`bdclick2`.`contcuentas3`.`CuentaDetotal2` AS `CuentaDetotal2`,`bdclick2`.`contatrasadas3`.`CuentaDeestado` AS `CuentaDeestado` from (((`bdclick2`.`bdcuota` join `bdclick2`.`consultacuentaspagadas` on((`bdclick2`.`bdcuota`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `bdclick2`.`contcuentas3` on((`bdclick2`.`contcuentas3`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `bdclick2`.`contatrasadas3` on((`consultacuentaspagadas`.`factura` = `bdclick2`.`contatrasadas3`.`contrato`))) group by `consultacuentaspagadas`.`factura`,`consultacuentaspagadas`.`vendedor`,`consultacuentaspagadas`.`cliente`,`consultacuentaspagadas`.`nombre`,`consultacuentaspagadas`.`fechaFactura`,`consultacuentaspagadas`.`vencimiento`,`consultacuentaspagadas`.`valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000),`consultacuentaspagadas`.`totalInteres`,`consultacuentaspagadas`.`total`,`consultacuentaspagadas`.`cuotas`,`bdclick2`.`contcuentas3`.`CuentaDetotal2`,`bdclick2`.`contatrasadas3`.`CuentaDeestado`)
mariadb-version=100135
