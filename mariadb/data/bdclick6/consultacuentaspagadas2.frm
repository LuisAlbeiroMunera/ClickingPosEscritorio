TYPE=VIEW
query=(select `consultacuentaspagadas`.`factura` AS `factura`,`consultacuentaspagadas`.`vendedor` AS `vendedor`,`consultacuentaspagadas`.`cliente` AS `cliente`,`consultacuentaspagadas`.`nombre` AS `nombre`,`consultacuentaspagadas`.`fechaFactura` AS `fechaFactura`,`consultacuentaspagadas`.`vencimiento` AS `vencimiento`,`consultacuentaspagadas`.`valorAprovado` AS `valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000) AS `interes2`,`consultacuentaspagadas`.`totalInteres` AS `totalInteres`,`consultacuentaspagadas`.`cuotas` AS `cuotas`,sum(`bdclick6`.`bdcuota`.`totalAbono`) AS `SumaDetotalAbono`,if(isnull(`bdclick6`.`contcuentas3`.`CuentaDetotal2`),\'0\',`bdclick6`.`contcuentas3`.`CuentaDetotal2`) AS `cuotasAbonadas`,if(isnull(`bdclick6`.`contatrasadas3`.`CuentaDeestado`),\'0\',`bdclick6`.`contatrasadas3`.`CuentaDeestado`) AS `cuotasAtrasadas` from (((`bdclick6`.`bdcuota` join `bdclick6`.`consultacuentaspagadas` on((`bdclick6`.`bdcuota`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `bdclick6`.`contcuentas3` on((`bdclick6`.`contcuentas3`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `bdclick6`.`contatrasadas3` on((`consultacuentaspagadas`.`factura` = `bdclick6`.`contatrasadas3`.`contrato`))) group by `consultacuentaspagadas`.`factura`,`consultacuentaspagadas`.`vendedor`,`consultacuentaspagadas`.`cliente`,`consultacuentaspagadas`.`nombre`,`consultacuentaspagadas`.`fechaFactura`,`consultacuentaspagadas`.`vencimiento`,`consultacuentaspagadas`.`valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000),`consultacuentaspagadas`.`totalInteres`,`consultacuentaspagadas`.`cuotas`,if(isnull(`bdclick6`.`contcuentas3`.`CuentaDetotal2`),\'0\',`bdclick6`.`contcuentas3`.`CuentaDetotal2`),if(isnull(`bdclick6`.`contatrasadas3`.`CuentaDeestado`),\'0\',`bdclick6`.`contatrasadas3`.`CuentaDeestado`))
md5=0fd24467f7323789112f003e378335d8
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:34
create-version=2
source=(select `consultacuentaspagadas`.`factura` AS `factura`,`consultacuentaspagadas`.`vendedor` AS `vendedor`,`consultacuentaspagadas`.`cliente` AS `cliente`,`consultacuentaspagadas`.`nombre` AS `nombre`,`consultacuentaspagadas`.`fechaFactura` AS `fechaFactura`,`consultacuentaspagadas`.`vencimiento` AS `vencimiento`,`consultacuentaspagadas`.`valorAprovado` AS `valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000) AS `interes2`,`consultacuentaspagadas`.`totalInteres` AS `totalInteres`,`consultacuentaspagadas`.`cuotas` AS `cuotas`,sum(`bdcuota`.`totalAbono`) AS `SumaDetotalAbono`,if(isnull(`contcuentas3`.`CuentaDetotal2`),\'0\',`contcuentas3`.`CuentaDetotal2`) AS `cuotasAbonadas`,if(isnull(`contatrasadas3`.`CuentaDeestado`),\'0\',`contatrasadas3`.`CuentaDeestado`) AS `cuotasAtrasadas` from (((`bdcuota` join `consultacuentaspagadas` on((`bdcuota`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `contcuentas3` on((`contcuentas3`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `contatrasadas3` on((`consultacuentaspagadas`.`factura` = `contatrasadas3`.`contrato`))) group by `consultacuentaspagadas`.`factura`,`consultacuentaspagadas`.`vendedor`,`consultacuentaspagadas`.`cliente`,`consultacuentaspagadas`.`nombre`,`consultacuentaspagadas`.`fechaFactura`,`consultacuentaspagadas`.`vencimiento`,`consultacuentaspagadas`.`valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000),`consultacuentaspagadas`.`totalInteres`,`consultacuentaspagadas`.`cuotas`,if(isnull(`contcuentas3`.`CuentaDetotal2`),\'0\',`contcuentas3`.`CuentaDetotal2`),if(isnull(`contatrasadas3`.`CuentaDeestado`),\'0\',`contatrasadas3`.`CuentaDeestado`))
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `consultacuentaspagadas`.`factura` AS `factura`,`consultacuentaspagadas`.`vendedor` AS `vendedor`,`consultacuentaspagadas`.`cliente` AS `cliente`,`consultacuentaspagadas`.`nombre` AS `nombre`,`consultacuentaspagadas`.`fechaFactura` AS `fechaFactura`,`consultacuentaspagadas`.`vencimiento` AS `vencimiento`,`consultacuentaspagadas`.`valorAprovado` AS `valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000) AS `interes2`,`consultacuentaspagadas`.`totalInteres` AS `totalInteres`,`consultacuentaspagadas`.`cuotas` AS `cuotas`,sum(`bdclick6`.`bdcuota`.`totalAbono`) AS `SumaDetotalAbono`,if(isnull(`bdclick6`.`contcuentas3`.`CuentaDetotal2`),\'0\',`bdclick6`.`contcuentas3`.`CuentaDetotal2`) AS `cuotasAbonadas`,if(isnull(`bdclick6`.`contatrasadas3`.`CuentaDeestado`),\'0\',`bdclick6`.`contatrasadas3`.`CuentaDeestado`) AS `cuotasAtrasadas` from (((`bdclick6`.`bdcuota` join `bdclick6`.`consultacuentaspagadas` on((`bdclick6`.`bdcuota`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `bdclick6`.`contcuentas3` on((`bdclick6`.`contcuentas3`.`contrato` = `consultacuentaspagadas`.`factura`))) left join `bdclick6`.`contatrasadas3` on((`consultacuentaspagadas`.`factura` = `bdclick6`.`contatrasadas3`.`contrato`))) group by `consultacuentaspagadas`.`factura`,`consultacuentaspagadas`.`vendedor`,`consultacuentaspagadas`.`cliente`,`consultacuentaspagadas`.`nombre`,`consultacuentaspagadas`.`fechaFactura`,`consultacuentaspagadas`.`vencimiento`,`consultacuentaspagadas`.`valorAprovado`,left(`consultacuentaspagadas`.`interes`,1000),`consultacuentaspagadas`.`totalInteres`,`consultacuentaspagadas`.`cuotas`,if(isnull(`bdclick6`.`contcuentas3`.`CuentaDetotal2`),\'0\',`bdclick6`.`contcuentas3`.`CuentaDetotal2`),if(isnull(`bdclick6`.`contatrasadas3`.`CuentaDeestado`),\'0\',`bdclick6`.`contatrasadas3`.`CuentaDeestado`))
mariadb-version=100135
